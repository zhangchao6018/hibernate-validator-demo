package com.example.validatordemo.Dto;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

/**
 * @Description:
 * @Author: zhangchao22
 * @Date: 2019/12/17 10:01
 **/
@Data
public class LoginFormDto {
    @NotBlank(message = "用户名不能为空")
    @Email
    private String username;

    @NotBlank(message = "密码不能为空")
    @Length(min = 6,message = "密码最少6位")
    private String password;

}
