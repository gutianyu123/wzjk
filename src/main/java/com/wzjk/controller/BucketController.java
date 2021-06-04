package com.wzjk.controller;



import com.github.pagehelper.PageInfo;
import com.wzjk.request.BucketReq;
import com.wzjk.response.BucketResp;
import com.wzjk.service.BucketService;
import com.wzjk.utils.ResultDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bucket")
@Api(value = "轮斗管理", tags = {"轮斗管理"})
public class BucketController {

    @Autowired
    private BucketService bucketService;

    @ApiOperation(value = "分页查询")
    @PostMapping(value = "/selectBucketPage")
    public ResultDto<PageInfo<BucketResp>> selectBucketPage(@RequestBody BucketReq bucketReq) {
        return bucketService.selectBucketPage(bucketReq);
    }
}
