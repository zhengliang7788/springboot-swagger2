package com.zhsw.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhengliang
 * @Description: 用户管理
 * @Date: 2019/12/29 15:13
 */
@Api(tags = "用户管理")
@RestController
public class UserController {
    @ApiOperation(value = "更新用户")
    @PostMapping("/updateUser")
    public String updateUser(){
        return  "修改用户";
    }
}
