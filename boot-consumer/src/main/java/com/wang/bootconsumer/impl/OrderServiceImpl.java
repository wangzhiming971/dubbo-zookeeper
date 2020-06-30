package com.wang.bootconsumer.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wang.dto.User;
import com.wang.service.OrderService;
import com.wang.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Reference(loadbalance = "RoundRobin",timeout = 1000)
    UserService userService;

    @Override
    public List<User> InitOderService(String uid) {
        return userService.getUserList(uid);
    }

    @Override
    public User getUser(String uid) {
        return userService.getUser(uid);
    }
}
