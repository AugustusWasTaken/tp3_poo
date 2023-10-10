package com.tp3.demo.service;


import com.tp3.demo.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService{
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDetails user = User.builder()
                .username(username)
                .password("contrasena")
                .roles("USER")
                .build();

        return user;
    }

    @Override
    public com.tp3.demo.model.User create(com.tp3.demo.model.User user) {
        return null;
    }


    public User create(User user) {
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        return user;
    }
}
