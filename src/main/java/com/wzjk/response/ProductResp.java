package com.wzjk.response;


import com.wzjk.entity.Product;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="productResp",description= "服务产品查询结果")
public class ProductResp extends Product {
}
