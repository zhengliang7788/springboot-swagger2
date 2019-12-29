package com.zhsw.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhengliang
 * @Description: 商品管理
 * @Date: 2019/12/29 15:14
 */
@Api(tags ="商品管理")
@RestController
public class ItemController {
    @ApiOperation(value = "保存商品")
    @PostMapping("/saveItem")
    public String  saveItem(){
        return "保存商品";
    }

}
