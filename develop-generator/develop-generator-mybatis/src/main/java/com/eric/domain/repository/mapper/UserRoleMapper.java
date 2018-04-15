package com.eric.domain.repository.mapper;

import com.eric.base.BaseMapper;
import com.eric.domain.entity.UserRole;

public interface UserRoleMapper extends BaseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserRole record);

    int insertSelective(UserRole record);

    UserRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);
}