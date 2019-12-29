package com.zhsw.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhengliang
 * @Description: 邮件管理
 * @Date: 2019/12/29 15:13
 */
@Api(tags ="邮件管理")
@RestController
public class MailController {
    @ApiOperation(value = "删除邮件")
    @GetMapping("/deleteMail")
    public String deleteMail(){
        return "删除邮件";
    }
}
