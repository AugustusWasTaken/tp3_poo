package com.tp3.demo.service;


import com.tp3.demo.dao.UserDao;
import com.tp3.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;

@Service
public class UserServiceImp implements UserService{
    @Autowired
    private UserDao userDao;

    Scanner scanner = new Scanner(System.in);

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDao.getUserByUsername(username);
        if (user == null){
            throw new UsernameNotFoundException(username);
        }
        return new User();

    }

    public List<User> getUsers(){
        return userDao.getUsers();
    }

    @Override
    public User create(User user) {
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        String username = scanner.nextLine();
        user.setName(username);
        return user;
    }
}
