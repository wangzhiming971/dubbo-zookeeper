package com.wang.service;

import com.wang.dto.User;

import java.util.List;

public interface OrderService {
    public List<User> InitOderService(String uid);

    public User getUser(String uid);
}
