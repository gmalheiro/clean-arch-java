package br.com.gmalheiro.springboot_cleanarch.main;

import br.com.gmalheiro.springboot_cleanarch.application.gateways.UserGateway;
import br.com.gmalheiro.springboot_cleanarch.application.usecases.CreateUserInteractor;
import br.com.gmalheiro.springboot_cleanarch.controllers.UserDTOMapper;
import br.com.gmalheiro.springboot_cleanarch.infrastructure.gateways.UserEntityMapper;
import br.com.gmalheiro.springboot_cleanarch.infrastructure.gateways.UserRepositoryGateway;
import br.com.gmalheiro.springboot_cleanarch.infrastructure.persistence.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
    @Bean
    CreateUserInteractor createUserCase(UserGateway userGateway) {
        return new CreateUserInteractor(userGateway);
    }

    @Bean
    UserGateway userGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        return new UserRepositoryGateway(userRepository, userEntityMapper);
    }

    @Bean
    UserEntityMapper userEntityMapper() {
        return new UserEntityMapper();
    }

    @Bean
    UserDTOMapper userDTOMapper() {
        return new UserDTOMapper();
    }
}