package com.wzjk.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wzjk.entity.Product;
import com.wzjk.mapper.ProductMapper;
import com.wzjk.request.ProductReq;
import com.wzjk.response.ProductResp;
import com.wzjk.service.ProductService;
import com.wzjk.utils.RestResult;
import com.wzjk.utils.ResultDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;


    @Override
    public ResultDto<PageInfo<ProductResp>> selectProduct(ProductReq productReq) {
        PageHelper.startPage(productReq.getCurrentPage(), productReq.getPageSize());
        List<ProductResp> list = productMapper.selectProduct(productReq);
        return RestResult.getSuccessResult(new PageInfo<>(list));
    }

    @Override
    public ResultDto<ProductResp> productDetail(Integer id) {
        ProductResp productResp=new ProductResp();
        Product product=productMapper.selectByPrimaryKey(id);
        BeanUtils.copyProperties(product,productResp);
        return RestResult.getSuccessResult(productResp);
    }
}
