package org.exam.mapper;

import org.apache.ibatis.annotations.*;
import org.exam.bean.SysUser;

import java.util.List;

@Mapper
public interface ISysUserMapper {

    @Select("select * from bu_sys_user")
    List<SysUser> queryList();

    SysUser getById(Integer id);

    void insert(SysUser sysUser);

    void update(SysUser sysUser);

    void delete(Integer id);

}
