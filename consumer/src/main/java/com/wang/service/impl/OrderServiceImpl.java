package com.wang.service.impl;


import com.wang.dto.User;
import com.wang.service.OrderService;
import com.wang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
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
