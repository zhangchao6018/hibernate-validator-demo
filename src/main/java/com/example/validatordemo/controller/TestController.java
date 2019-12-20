package com.example.validatordemo.controller;

import com.example.validatordemo.Annotation.HeaderChecker;
import com.example.validatordemo.Dto.LoginFormDto;
import com.example.validatordemo.result.ResultMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @Description:
 * @Author: zhangchao22
 * @Date: 2019/12/17 9:57
 **/
@RestController
@RequestMapping("validator")
public class TestController {
    /**
     * 传参示例
     * {
     * 	"name":"12zhangsan@163.com",
     * 	"password":"123456",
     * 	"date":"2019-01-01"
     * }
     * @param dto
     * @return
     */
    @PostMapping("/test")
    @HeaderChecker(headerNames = "test")
    public ResultMap<String> validator(@Valid @RequestBody LoginFormDto dto){
        return ResultMap.success("hello"+dto.getUsername()+","+dto.getDate());
    }
}
