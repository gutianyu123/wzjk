package com.wzjk.utils;

import org.springframework.util.StringUtils;

/**
 * restful风格返回值
 *
 * @author Roy
 */
public class RestResult {
    private static final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";
    private static final String DEFAULT_FAIL_MESSAGE    = "FAIL";

    public static <T> ResultDto<T> getSuccessResult(T data) {
        return getSuccessResult(-1, data, null);
    }

    public static <T> ResultDto<T> getSuccessResult(String message) {
        return getSuccessResult(-1, null, message);
    }

    public static <T> ResultDto<T> getSuccessResult(T data, String message) {
        return getSuccessResult(-1, data, message);
    }

    public static <T> ResultDto<T> getSuccessResult(int code, T data, String message) {
        ResultDto result = new ResultDto();
        result.setSuccess(true);
        if (code == -1) {
            code = com.wzjk.utils.RestCode.RESULT_CODE_SUCCESS;
        }
        result.setResultCode(code);
        if (StringUtils.isEmpty(message)) {
            message = DEFAULT_SUCCESS_MESSAGE;
        }
        result.setResultDesc(message);
        result.setResult(data);
        return result;
    }

    public static ResultDto getFailResult(String message) {
        return getFailResult(-1, message);
    }

    public static ResultDto getFailResult(int code, String message) {
        ResultDto result = new ResultDto();
        result.setResult(false);
        if (code == -1) {
            code = com.wzjk.utils.RestCode.RESULT_CODE_SUCCESS;
        }
        if (StringUtils.isEmpty(message)) {
            message = DEFAULT_FAIL_MESSAGE;
        }
        result.setResultCode(code);
        result.setResultDesc(message);
        return result;
    }
}
