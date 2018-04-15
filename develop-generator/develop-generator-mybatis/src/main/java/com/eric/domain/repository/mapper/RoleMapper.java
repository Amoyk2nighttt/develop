package com.eric.domain.repository.mapper;

import com.eric.base.BaseMapper;
import com.eric.domain.entity.Role;

public interface RoleMapper extends BaseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}