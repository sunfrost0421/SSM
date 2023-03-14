package com.qrc.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qrc.domain.Users;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends BaseMapper<Users> {
}
