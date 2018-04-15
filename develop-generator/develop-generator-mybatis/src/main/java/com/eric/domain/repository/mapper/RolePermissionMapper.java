package com.eric.domain.repository.mapper;

import com.eric.base.BaseMapper;
import com.eric.domain.entity.RolePermission;

public interface RolePermissionMapper extends BaseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RolePermission record);

    int insertSelective(RolePermission record);

    RolePermission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RolePermission record);

    int updateByPrimaryKey(RolePermission record);
}