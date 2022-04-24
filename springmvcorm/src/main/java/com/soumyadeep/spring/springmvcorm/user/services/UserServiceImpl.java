package com.soumyadeep.spring.springmvcorm.user.services;

import java.util.Collections;
import java.util.List;

import com.soumyadeep.spring.springmvcorm.user.dao.UserDAO;
import com.soumyadeep.spring.springmvcorm.user.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO dao;

    public UserDAO getDao() {
        return dao;
    }

    public void setDao(UserDAO dao) {
        this.dao = dao;
    }

    @Override
    @Transactional
    public int save(User user) {
        // Business logic
        return dao.create(user);
    }

    @Override
    public List<User> getUsers() {
        List<User> users = dao.findAllUsers();
        Collections.sort(users);
        return users;
    }

    @Override
    public User getUser(Integer id) {
        return dao.findUser(id);
    }

}