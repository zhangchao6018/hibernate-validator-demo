package com.example.validatordemo.controller;

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
    @PostMapping("/")
    public ResultMap<String> validator(@Valid @RequestBody LoginFormDto dto){
        return ResultMap.success("hello"+dto.getUsername());
    }
}
