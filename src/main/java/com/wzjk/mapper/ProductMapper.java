package com.wzjk.mapper;

import com.wzjk.entity.Product;
import com.wzjk.request.ProductReq;
import com.wzjk.response.ProductResp;

import java.util.List;

public interface ProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    List<ProductResp> selectProduct(ProductReq productReq);
}