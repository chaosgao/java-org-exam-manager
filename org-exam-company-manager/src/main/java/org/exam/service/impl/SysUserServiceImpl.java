package org.exam.service.impl;

import org.apache.ibatis.annotations.Select;
import org.exam.bean.SysUser;
import org.exam.mapper.ISysUserMapper;
import org.exam.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl implements ISysUserService {

    @Autowired
    private ISysUserMapper sysUserMapper;

    @Override
    public List<SysUser> queryList() {
        return sysUserMapper.queryList();
    }

    @Override
    public SysUser getById(Integer id) {
        return sysUserMapper.getById(id);
    }

    @Override
    public void insert(SysUser sysUser) {
        sysUserMapper.insert(sysUser);
    }

    @Override
    public void update(SysUser sysUser) {
        sysUserMapper.update(sysUser);
    }

    @Override
    public void delete(Integer id) {
        sysUserMapper.delete(id);
    }
}
