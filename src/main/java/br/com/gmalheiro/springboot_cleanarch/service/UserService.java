package br.com.gmalheiro.springboot_cleanarch.service;

import br.com.gmalheiro.springboot_cleanarch.model.User;
import br.com.gmalheiro.springboot_cleanarch.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService (UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User create (User user) {
        return userRepository.save(user);
    }
}
