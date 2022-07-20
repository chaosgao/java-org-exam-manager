package org.exam.controller;

import org.exam.bean.SysUser;
import org.exam.commons.Result;
import org.exam.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private ISysUserService sysUserService;

    @GetMapping("list")
    public Result list(){
        List<SysUser> list = sysUserService.queryList();

        return Result.ok(list);
    }

    @GetMapping("insert")
    public Result insert(){
        return Result.ok();
    }
}
