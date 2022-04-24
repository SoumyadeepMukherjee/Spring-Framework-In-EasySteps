package com.soumyadeep.spring.springmvcorm.user.dao;

import java.util.List;

import com.soumyadeep.spring.springmvcorm.user.entity.User;

public interface UserDAO {

    int create(User user);

    List<User> findAllUsers();

    User findUser(int id);
}