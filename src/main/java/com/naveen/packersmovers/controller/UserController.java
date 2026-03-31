package com.chandu.userform.controller;

import com.chandu.userform.model.User;
import com.chandu.userform.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String loadForm(User user) {
        return "form";
    }

    @PostMapping("/submit")
    public String submitForm(User user) {
        userService.saveUser(user);
        return "success";
    }
}
