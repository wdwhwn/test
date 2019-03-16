package com.jz.controller;

import com.jz.entity.User;
import com.jz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2019/3/16 0016.
 */
@RestController
@CrossOrigin(origins = "*",maxAge = 3600)
public class UserController {
    @Autowired
    private UserService us;
    @RequestMapping("/user")
    public List<User> userSelectAll(){
        System.out.println("etesf");
        System.out.println("etesf");
        System.out.println("etesf");
        System.out.println("etesf");
        System.out.println("etesf");
        System.out.println("6");
        List<User> users = us.selectAll();
        return  users;
    }
}
