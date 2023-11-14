package com.tp3.demo.controller;

import com.tp3.demo.model.User;
import com.tp3.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/new")
    public String newClient(Model model){
        model.addAttribute("client",new User());
        return "users/new";
    }

    @PostMapping
    public String create(@ModelAttribute User user){
        userService.create(user);
        return "redirect:/users";
    }

    @GetMapping
    public String clients(Model model){
        model.addAttribute("users",userService.getUsers());
        return "users/index";
    }



}
