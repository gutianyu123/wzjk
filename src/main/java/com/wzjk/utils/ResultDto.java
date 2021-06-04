package com.wzjk.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONType;

import java.io.Serializable;


/**
 * @author Roy
 */
@JSONType(orders={"success","resultCode","resultDesc","result"})
public class ResultDto<T> implements Serializable {
    private static final long    serialVersionUID = -5999174785733173590L;
    private              boolean success;
    private              int     resultCode;
    private              String  resultDesc;
    private              T       result;

    public ResultDto() {
        this(false);
    }

    public ResultDto(boolean success) {
        this.success = success;
    }

    public ResultDto(boolean success, int resultCode, String resultDesc, T result) {
        this.success = success;
        this.resultCode = resultCode;
        this.resultDesc = resultDesc;
        this.result = result;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultDesc() {
        return resultDesc;
    }

    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    @Override
    public String toString() {
        String result = JSON.toJSONString(this);
        return result;
    }


}
