package com.eric.domain.repository.mapper;

import com.eric.base.BaseMapper;
import com.eric.domain.entity.User;

public interface UserMapper extends BaseMapper {
    int deleteByPrimaryKey(String id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}