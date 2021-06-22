package com.wzjk.service;

import com.github.pagehelper.PageInfo;
import com.wzjk.request.ProductReq;
import com.wzjk.response.ProductResp;
import com.wzjk.utils.ResultDto;

public interface ProductService {

    public ResultDto<PageInfo<ProductResp>> selectProduct(ProductReq productReq);

    public ResultDto<ProductResp> productDetail(Integer id);
}
