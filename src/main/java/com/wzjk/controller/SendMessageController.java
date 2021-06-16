package com.wzjk.controller;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import com.wzjk.config.OssConfigure;
import com.wzjk.utils.RestResult;
import com.wzjk.utils.ResultDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
@Api(value = "短信发送管理", tags = {"短信发送管理"})
public class SendMessageController {

    @ApiOperation(value = "短信发送")
    @GetMapping(value = "/sendMessage")
    public ResultDto<Integer> sendMessage(String phone) throws ClientException {

        String product = "Dysmsapi";
        //产品域名,开发者无需替换
        String domain = "dysmsapi.aliyuncs.com";

        // TODO 此处需要替换成开发者自己的AK(在阿里云访问控制台寻找)
        String accessKeyId = OssConfigure.OSS.accessKeyId;
        String accessKeySecret = OssConfigure.OSS.accessKeySecret;

        //初始化acsClient,暂不支持region化
        IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", accessKeyId, accessKeySecret);
        DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", product, domain);
        IAcsClient acsClient = new DefaultAcsClient(profile);

        //组装请求对象-具体描述见控制台-文档部分内容
        SendSmsRequest request = new SendSmsRequest();
        //必填:待发送手机号
        request.setPhoneNumbers(phone);
        //必填:短信签名-可在短信控制台中找到
        request.setSignName("物正科技");
        //必填:短信模板-可在短信控制台中找到
        request.setTemplateCode("SMS_217915435");
        int code = (int) (Math.random() * 9000 + 1000);
        //可选:模板中的变量替换JSON串,如模板内容为"亲爱的${name},您的验证码为${code}"时,此处的值为
        request.setTemplateParam("{\"code\":\"" + code + "\"}");

        //hint 此处可能会抛出异常，注意catch
        SendSmsResponse sendSmsResponse = acsClient.getAcsResponse(request);

        if ("OK".equals(sendSmsResponse.getCode())) {
            return RestResult.getSuccessResult(code);
        } else {
            return RestResult.getFailResult("短信发送失败！请稍后重试！");
        }
    }
}
