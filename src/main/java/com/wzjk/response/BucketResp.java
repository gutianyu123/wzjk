package com.wzjk.response;

import com.wzjk.entity.Bucket;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="bucketResp",description= "轮斗查询结果")
public class BucketResp extends Bucket {

}
