package com.cornerkick.service.impl;

import com.cornerkick.dao.UserDao;
import com.cornerkick.domain.User;
import com.cornerkick.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by cornerkick on 16/8/8.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getAll() {
        return userDao.findAll();
    }
}
