package com.wzjk.service.impl;

import com.aliyun.oss.OSSClient;
import com.aliyun.oss.common.utils.BinaryUtil;
import com.aliyun.oss.model.MatchMode;
import com.aliyun.oss.model.PolicyConditions;
import com.wzjk.config.OssConfigure;
import com.wzjk.service.FileUploadService;
import com.wzjk.utils.OssCallBackUtil;
import net.sf.json.JSONObject;
import org.apache.commons.codec.binary.Base64;
import org.springframework.stereotype.Service;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class FileUploadServiceImpl implements FileUploadService {


    @Override
    public void getPolicy(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // TODO Auto-generated method stub
        String dir = "";

        OSSClient client = new OSSClient(OssConfigure.OSS.endpoint, OssConfigure.OSS.accessKeyId, OssConfigure.OSS.accessKeySecret);

        long expireTime = 30;
        long expireEndTime = System.currentTimeMillis() + expireTime * 1000;
        Date expiration = new Date(expireEndTime);
        PolicyConditions policyConds = new PolicyConditions();
        policyConds.addConditionItem(PolicyConditions.COND_CONTENT_LENGTH_RANGE, 0, 1048576000);
        policyConds.addConditionItem(MatchMode.StartWith, PolicyConditions.COND_KEY, dir);

        String postPolicy = client.generatePostPolicy(expiration, policyConds);
        byte[] binaryData = postPolicy.getBytes("utf-8");
        String encodedPolicy = BinaryUtil.toBase64String(binaryData);
        String postSignature = client.calculatePostSignature(postPolicy);

        String callbackbody = "{\'bucket\':${bucket}, \'object\':${object},\'size\':${size},\'mimeType\':${mimeType},\'uid\':${x:uid}}";
        String callback = "{\"callbackUrl\":\"" + OssConfigure.OSS.callBack + "\",\"callbackBody\":\"" + callbackbody
                + "\",\"callbackBodyType\":\"application/json\"}";
        byte[] bytes = Base64.encodeBase64(callback.getBytes("UTF-8"));

        Map<String, String> respMap = new LinkedHashMap<String, String>();
        respMap.put("callback", new String(bytes));
        respMap.put("accessid", OssConfigure.OSS.accessKeyId);
        respMap.put("policy", encodedPolicy);
        respMap.put("signature", postSignature);
        respMap.put("dir", dir);
        respMap.put("host", OssConfigure.OSS.host);
        respMap.put("expire", String.valueOf(expireEndTime / 1000));

        JSONObject ja1 = JSONObject.fromObject(respMap);

        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "GET, POST");
        OssCallBackUtil.response(request, response, ja1.toString(), 0);

    }
}
