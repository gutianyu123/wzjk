package com.wzjk.controller;

import com.github.pagehelper.PageInfo;
import com.wzjk.request.KnowledgeReq;
import com.wzjk.response.KnowledgeResp;
import com.wzjk.service.KnowledgeService;
import com.wzjk.utils.ResultDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/knowledge")
@Api(value = "知识管理", tags = {"知识管理"})
public class KnowledgeController {

    @Autowired
    private KnowledgeService knowledgeService;


    @ApiOperation(value = "知识分页列表")
    @PostMapping(value = "/selectKnowledgePage")
    public ResultDto<PageInfo<KnowledgeResp>> selectKnowledgePage(@RequestBody KnowledgeReq knowledgeReq) {
        return knowledgeService.selectKnowledgePage(knowledgeReq);

    }


    @ApiOperation(value = "知识详情")
    @GetMapping(value = "/selectKnowledgeDetail")
    public ResultDto<KnowledgeResp> selectKnowledgeDetail(Integer id) {
        return knowledgeService.selectKnowledgeDetail(id);

    }
}
