package com.tp3.demo.service;

import com.tp3.demo.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

public interface UserService extends UserDetailsService {
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

    public User create(User user);

    public List<User> getUsers();


}
