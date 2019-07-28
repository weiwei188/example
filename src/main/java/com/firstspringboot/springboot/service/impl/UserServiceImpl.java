package com.firstspringboot.springboot.service.impl;

import com.firstspringboot.springboot.dao.UserDao;
import com.firstspringboot.springboot.entity.User;
import com.firstspringboot.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: UserServiceImpl
 * @Description: 用户信息逻辑实现类
 * @Author: WeiWei
 * @Date: 2019-07-26 12：01
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;


    public List<User> selectAllUser() {
        return userDao.selectAllUser();
    }


    public User selectUserById(Integer id) {
        return userDao.selectUserById(id);
    }

    @Override
    public Long insertUser(User user) {
        return null;
    }

    @Override
    public Long updateUser(User user) {
        return null;
    }

    @Override
    public Long deleteUserById(Integer id) {
        return userDao.deleteUserById(id);
    }

}
