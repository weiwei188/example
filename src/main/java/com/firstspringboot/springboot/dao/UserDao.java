package com.firstspringboot.springboot.dao;

import com.firstspringboot.springboot.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//接口没有方法体
@Mapper
public interface UserDao {
    List<User> selectAllUser();
    User selectUserById(Integer id);
    Long updateUser(User user);
    Long deleteUserById(Integer id);
    Long insertUser(User user);
}
