package com.wzjk.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wzjk.mapper.BucketMapper;
import com.wzjk.request.BucketReq;
import com.wzjk.response.BucketResp;
import com.wzjk.service.BucketService;
import com.wzjk.utils.RestResult;
import com.wzjk.utils.ResultDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class BucketServiceImpl implements BucketService {

    @Autowired
    private BucketMapper bucketMapper;

    @Override
    public ResultDto<PageInfo<BucketResp>> selectBucketPage(BucketReq bucketReq) {
        PageHelper.startPage(bucketReq.getCurrentPage(), bucketReq.getPageSize());
        List<BucketResp> list = bucketMapper.selectBucketPage(bucketReq);
        return RestResult.getSuccessResult(new PageInfo<>(list));
    }
}
