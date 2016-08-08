package com.cornerkick.dao;

import com.cornerkick.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by cornerkick on 16/8/8.
 */
@Repository
public interface UserDao extends CrudRepository<User, Long> {

    List<User> findAll();

    User findByName(String name);
}
