package com.example.validatordemo.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @Description:
 * @Author: zhangchao22
 * @Date: 2019/12/17 10:01
 **/
@Data
public class LoginFormDto {
    @NotBlank(message = "用户名不能为空")
    @Email
    @JsonProperty("name")//入参映射成name
    private String username;

    @NotBlank(message = "密码不能为空")
    @Length(min = 6,message = "密码最少6位")
    private String password;

    @NotBlank(message = "日期格式不正确")//限制格式
    @Length(max = 10,min = 10,message = "日期格式不正确")//限制长度
    private String date;

    public String getDate() {
        return date;
    }

    /**
     *
     * @param date
     */
    public void setDate(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            //是否允许不合法日期合法（如：2019-01-32）
            sdf.setLenient(false);
            sdf.parse(date);
            this.date = date;
        } catch (ParseException e) {
            e.printStackTrace();
            this.date = null;
        }
    }
}
