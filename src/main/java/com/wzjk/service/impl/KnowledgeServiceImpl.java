package com.wzjk.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wzjk.entity.Knowledge;
import com.wzjk.mapper.KnowledgeMapper;
import com.wzjk.request.KnowledgeReq;
import com.wzjk.response.KnowledgeResp;
import com.wzjk.response.NrResp;
import com.wzjk.service.KnowledgeService;
import com.wzjk.utils.RestResult;
import com.wzjk.utils.ResultDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class KnowledgeServiceImpl implements KnowledgeService {

    @Autowired
    private KnowledgeMapper knowledgeMapper;

    @Override
    public ResultDto<PageInfo<KnowledgeResp>> selectKnowledgePage(KnowledgeReq knowledgeReq) {
        PageHelper.startPage(knowledgeReq.getCurrentPage(), knowledgeReq.getPageSize());
        List<KnowledgeResp> list = knowledgeMapper.selectKnowledgePage(knowledgeReq);
        list.forEach(x->{
            String nr=x.getNr().replaceAll("<br/>","");
            x.setNr(nr);
        });
        return RestResult.getSuccessResult(new PageInfo<>(list));
    }

    @Override
    public ResultDto<KnowledgeResp> selectKnowledgeDetail(Integer id) {
        List<NrResp> list=new ArrayList<>();
        Knowledge knowledge=knowledgeMapper.selectByPrimaryKey(id);
        KnowledgeResp knowledgeResp=new KnowledgeResp();
        BeanUtils.copyProperties(knowledge,knowledgeResp);
        String[] arrs=knowledgeResp.getNr().split("<br/>");
        for(String arr:arrs){
            NrResp nrResp=new NrResp();
            if(arr.contains("http")){
                nrResp.setKey("图片");
                nrResp.setContent(arr);
            }else{
                nrResp.setKey("文字");
                nrResp.setContent(arr);
            }
            list.add(nrResp);
        }
        knowledgeResp.setList(list);
        return RestResult.getSuccessResult(knowledgeResp);
    }
}
