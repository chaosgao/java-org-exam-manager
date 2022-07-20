package org.exam.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.exam.bean.SysUser;
import org.exam.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "系统用户接口")
@RestController
@RequestMapping("sysUser")
public class SysUserController {

    @Autowired
    private ISysUserService sysUserService;

    @ApiOperation("列表")
    @GetMapping("list")
    public List<SysUser> queryList(){
        return sysUserService.queryList();
    }

    @ApiOperation("详情")
    @ApiImplicitParams(@ApiImplicitParam(name = "id" ,value = "用户主键" ,required = true ,dataType = "integer"))
    @GetMapping("list/{id}")
    public SysUser getById(@PathVariable Integer id){
        return sysUserService.getById(id);
    }

    @ApiOperation("新增")
    @PostMapping("insert")
    public void insert(@RequestBody SysUser sysUser){
        sysUserService.insert(sysUser);
    }

    @ApiOperation("修改")
    @PostMapping("update")
    public void update(@RequestBody SysUser sysUser){
        sysUserService.update(sysUser);
    }

    @ApiOperation("删除")
    @ApiImplicitParams(@ApiImplicitParam(name = "id" ,value = "用户主键" ,required = true ,dataType = "integer"))
    @GetMapping("delete/{id}")
    public void delete(@PathVariable Integer id){
        sysUserService.delete(id);
    }
}
