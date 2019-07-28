package com.firstspringboot.springboot.service;

import com.firstspringboot.springboot.entity.User;

import java.util.List;

/**
 * @ClassName: UserService
 * @Description: 用户信息逻辑接口类
 * @Author: WeiWei
 * @Date: 2019-07-26 11：52
 */
public interface UserService {
    /**
     * 获取用户信息列表
     *
     * @return
     */
    List<User> selectAllUser();

    /**
     * 根据用户id查询用户信息
     *
     * @param id
     * @return
     */
    User selectUserById(Integer id);

    /**
     * 新增用户信息
     *
     * @param user
     * @return
     * */
    Long insertUser(User user);

    /**
     * 更新用户信息
     *
     * @param user
     * @return
     * */

    Long updateUser(User user);
    /**
     * 根据用户id删除用户信息
     *
     * @param id
     * @return
     */
    Long deleteUserById(Integer id);


}
