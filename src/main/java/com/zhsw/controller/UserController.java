package com.zhsw.controller;

import com.zhsw.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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
    public String updateUser(@RequestBody User user){
        return  "修改用户";
    }
}
