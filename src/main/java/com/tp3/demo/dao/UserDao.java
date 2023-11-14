package com.tp3.demo.dao;

import com.tp3.demo.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public void createAdmin(){
        User user = new User();
        user.setFirstname("admin");
        user.setLastname("sudo");
        user.setPassword("admin");
        user.setEmail("hola@gmail.com");
        this.addUser(user);
        System.out.println(user.getLastname());
        System.out.println(user.getFirstname());
        System.out.println("solo llega esto");

    }

    public void addUser(User user){
        getUsers().add(user);
    }

    public User getUserByUsername(String username){
        Optional<User> userOptional = this.getUsers().stream()
                .filter(user -> user.getUsername().equals(username))
                .findFirst();

        return userOptional.orElse(null);
    }


}
