package com.wang.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wang.dto.User;
import com.wang.service.UserService;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<User> getUserList(String uid) {
        System.out.println("UserServiceImpl--01");
        List<User>  list = new ArrayList<User>();
        list.add(new User("1","张三",18,"男","长沙"));
        list.add(new User("2","李四",19,"女","岳阳"));
        list.add(new User("3","王五",20,"男","衡阳"));
        list.add(new User("4","赵六",21,"女","耒阳"));
        list.add(new User("5","冯七",22,"男","邵阳"));
        return list;
    }

    @Override
    public User getUser(String uid) {

        return new User("6","胡八",23,"女","浏阳");
    }
}
