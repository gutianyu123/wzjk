package com.wzjk.controller;

import com.wzjk.service.FileUploadService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Api(tags={"附件接口"})
@RestController
@RequestMapping("/fileUpload")
public class FileUploadController {

    @Autowired
    private FileUploadService fileUploadService;

    @ApiOperation(value="附件上传")
    @PostMapping(value = "/policy")
    public void upload(HttpServletRequest request, HttpServletResponse response) throws Exception {
        fileUploadService.getPolicy(request, response);
    }
}
