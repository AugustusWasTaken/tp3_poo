package com.tp3.demo.service;

import com.tp3.demo.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    public User create(User user);
}
