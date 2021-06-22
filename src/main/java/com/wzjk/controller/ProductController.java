package com.wzjk.controller;

import com.github.pagehelper.PageInfo;
import com.wzjk.request.ProductReq;
import com.wzjk.response.ProductResp;
import com.wzjk.service.ProductService;
import com.wzjk.utils.ResultDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
@Api(value = "服务产品管理", tags = {"服务产品管理"})
public class ProductController {


    @Autowired
    private ProductService productService;

    @ApiOperation(value = "服务产品分页列表")
    @PostMapping(value = "/selectProduct")
    public ResultDto<PageInfo<ProductResp>> selectProduct(@RequestBody ProductReq productReq) {
        return productService.selectProduct(productReq);

    }


    @ApiOperation(value = "服务产品详情")
    @GetMapping(value = "/productDetail")
    public ResultDto<ProductResp> productDetail(Integer id) {
        return productService.productDetail(id);

    }
}
