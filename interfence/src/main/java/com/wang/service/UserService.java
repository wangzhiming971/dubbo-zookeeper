package com.wang.service;

import com.wang.dto.User;

import java.util.List;

public interface UserService {
    /**
     * 根据uid获取一个集合
     * */
    public List<User> getUserList(String uid);
    /**
     * 根据uid获取一个对象
     * */
    public User  getUser(String uid);
}
