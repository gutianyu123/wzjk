package com.wzjk.mapper;

import com.wzjk.entity.Bucket;
import com.wzjk.request.BucketReq;
import com.wzjk.response.BucketResp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface BucketMapper {

    int deleteByPrimaryKey(String buId);

    int insert(Bucket record);

    int insertSelective(Bucket record);

    Bucket selectByPrimaryKey(String buId);

    int updateByPrimaryKeySelective(Bucket record);

    int updateByPrimaryKey(Bucket record);

    List<BucketResp> selectBucketPage(BucketReq bucketReq);
}