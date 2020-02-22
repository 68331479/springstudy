package com.kuang.mapper;

import com.kuang.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface UserMapper {
    public List<User> selectUser();

}
