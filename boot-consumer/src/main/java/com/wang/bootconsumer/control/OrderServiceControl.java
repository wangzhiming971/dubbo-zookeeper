package com.wang.bootconsumer.control;

import com.wang.dto.User;
import com.wang.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
public class OrderServiceControl {
    @Autowired
    OrderService orderService;

    @ResponseBody
    @RequestMapping(value = "/initOrder",method = RequestMethod.GET)
    public List<User> getInitOder(String uid){

        return  orderService.InitOderService(uid);
    }
}
