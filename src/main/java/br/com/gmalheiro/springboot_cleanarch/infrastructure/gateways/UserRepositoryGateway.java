package br.com.gmalheiro.springboot_cleanarch.infrastructure.gateways;

import br.com.gmalheiro.springboot_cleanarch.application.gateways.UserGateway;
import br.com.gmalheiro.springboot_cleanarch.domain.entity.User;
import br.com.gmalheiro.springboot_cleanarch.infrastructure.persistence.UserEntity;
import br.com.gmalheiro.springboot_cleanarch.infrastructure.persistence.UserRepository;

public class UserRepositoryGateway implements UserGateway {

    private final UserRepository repository;
    private final UserEntityMapper mapper;

    public UserRepositoryGateway(UserRepository repository,UserEntityMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public User createUser(User userDomainObj) {
        UserEntity entity = mapper.toEntity(userDomainObj);
        UserEntity savedObj = repository.save(entity);
        return  mapper.toDomainObj(savedObj);
    }
}
