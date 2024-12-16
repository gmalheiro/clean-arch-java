package br.com.gmalheiro.springboot_cleanarch.controllers;

import br.com.gmalheiro.springboot_cleanarch.application.usecases.CreateUserInteractor;
import br.com.gmalheiro.springboot_cleanarch.domain.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private CreateUserInteractor createUserInteractor;
    private UserDTOMapper mapper;

    public UserController(CreateUserInteractor createUserInteractor,UserDTOMapper mapper) {
        this.createUserInteractor = createUserInteractor;
        this.mapper = mapper;
    }

    @PostMapping
    CreateUserResponse create (@RequestBody CreateUserRequest request) {
        User userBusinessObj = mapper.toUser(request);
        User user = createUserInteractor.createUser(userBusinessObj);
        return mapper.toResponse(user);
    }
}
