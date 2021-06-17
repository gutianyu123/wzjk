package com.wzjk.response;

import com.wzjk.entity.City;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="cityResp",description= "地区查询结果")
public class CityResp extends City {

    @ApiModelProperty(value = "子地区list")
    private List<CityResp> children;
}
