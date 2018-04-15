package com.eric.domain.repository.mapper;

import com.eric.base.BaseMapper;
import com.eric.domain.entity.Permission;

public interface PermissionMapper extends BaseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);
}