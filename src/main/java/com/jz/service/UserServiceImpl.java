package com.jz.service;

import com.jz.dao.UserDao;
import com.jz.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2019/3/16 0016.
 */
@Service
@Transactional
public class UserServiceImpl implements  UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> selectAll() {
        List<User> userList = userDao.selectAll();
        return userList;
    }
}
