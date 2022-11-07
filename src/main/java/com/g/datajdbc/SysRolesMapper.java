package com.g.datajdbc;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysRolesMapper {
    List<SysRole> list();
}
