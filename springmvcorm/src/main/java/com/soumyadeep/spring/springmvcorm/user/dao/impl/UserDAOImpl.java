package com.soumyadeep.spring.springmvcorm.user.dao.impl;

import java.util.List;

import com.soumyadeep.spring.springmvcorm.user.dao.UserDAO;
import com.soumyadeep.spring.springmvcorm.user.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    public int create(User user) {
        Integer result = (Integer) hibernateTemplate.save(user);
        return result;
    }

    @Override
    public List<User> findAllUsers() {

        return hibernateTemplate.loadAll(User.class);
    }

    @Override
    public User findUser(int id) {
        return hibernateTemplate.get(User.class, id);
    }

}