package br.com.gmalheiro.springboot_cleanarch.controller;

import br.com.gmalheiro.springboot_cleanarch.model.User;
import br.com.gmalheiro.springboot_cleanarch.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    User create (@RequestBody User user) {
        return  userService.create(user);
    }
}
