package com.tp3.demo.dao;

import com.tp3.demo.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDao {

    public List<User> users;

    public UserDao() {
        users = new ArrayList<User>();
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void addUser(User user){
        getUsers().add(user);
    }

    public User getUserByUsername(String username){
        return this.getUsers().stream().
                filter((User user) -> {
                    return user.getUsername().equals(username);
                }).findFirst().get();

    }


}
