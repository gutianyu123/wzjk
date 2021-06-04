package com.wzjk.service;


import com.github.pagehelper.PageInfo;
import com.wzjk.request.BucketReq;
import com.wzjk.response.BucketResp;
import com.wzjk.utils.ResultDto;

public interface BucketService {

    public ResultDto<PageInfo<BucketResp>> selectBucketPage(BucketReq bucketReq);
}
