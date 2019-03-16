package com.jz.dao;

import com.jz.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface UserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    User selectByPrimaryKey(Integer id);

    List<User> selectAll();

    int updateByPrimaryKey(User record);
}