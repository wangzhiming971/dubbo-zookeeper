package com.wang.service.impl;

import com.wang.dto.User;
import com.wang.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import java.util.List;

public class UserServiceImplStub implements UserService {

    private  UserService userService;
    public UserServiceImplStub(UserService userService) {
        this.userService = userService;
    }
    @Override
    public List<User> getUserList(String uid) {
        System.out.println("UserServiceImplStub.getUserList");
        if(StringUtils.isEmpty(uid)){
            return null;

        }
        return userService.getUserList(uid);
    }

    @Override
    public User getUser(String uid) {
        System.out.println("UserServiceImplStub.getUser");
        if(StringUtils.isEmpty(uid)){
            return null;
        }
        return userService.getUser(uid);
    }
}
