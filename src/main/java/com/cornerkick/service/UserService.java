package com.cornerkick.service;

import com.cornerkick.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by cornerkick on 16/8/8.
 */
public interface UserService {
    public List<User> getAll();
}
