package com.cornerkick.dao;

import com.cornerkick.App;
import com.cornerkick.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by cornerkick on 16/8/8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=App.class)
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void testFindAll() {
        List<User> users = userDao.findAll();

        for (User user: users) {
            System.out.println(user);
        }
    }

    @Test
    public void testFindByName() throws Exception {
        User user = userDao.findByName("test_user");

        System.out.println(user);
    }
}