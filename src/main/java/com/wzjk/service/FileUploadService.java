package com.wzjk.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface FileUploadService {

    public void getPolicy(HttpServletRequest request, HttpServletResponse response) throws IOException;

}
