package com.wzjk.controller;

import com.wzjk.response.CityResp;
import com.wzjk.response.KnowledgeTypeResp;
import com.wzjk.service.KnowledgeTypeService;
import com.wzjk.utils.ResultDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/knowledgeType")
@Api(value = "知识类型管理", tags = {"知识类型管理"})
public class KnowledgeTypeController {

    @Autowired
    private KnowledgeTypeService knowledgeTypeService;

    @ApiOperation(value = "知识类型列表")
    @GetMapping(value = "/selectKnowledgeTypeList")
    public ResultDto<List<KnowledgeTypeResp>> selectKnowledgeTypeList() {
        return knowledgeTypeService.selectKnowledgeTypeList();

    }
}
