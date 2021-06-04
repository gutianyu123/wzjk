package com.wzjk.utils;

/**
 * restful返回码
 *
 * @author youyuchen
 */
public class RestCode {
    public static final int RESULT_CODE_SUCCESS      = 200; // 成功处理请求
    public static final int RESULT_CODE_SERVER_ERROR = 500; // 没有对应结果,服务器内部错误
    public static final int RESULT_CODE_FAIL         = 400; // 异常请求
    public static final int RESULT_CODE_UNAUTHORIZED = 401; // 未认证（签名错误）
    public static final int RESULT_CODE_NOT_FOUND    = 404; // 接口不存在
    public static final int RESULT_CODE_INVALID      = 204; // 内容为空或无效
}
