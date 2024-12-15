package br.com.gmalheiro.springboot_cleanarch.infrastructure.gateways;

import br.com.gmalheiro.springboot_cleanarch.domain.entity.User;
import br.com.gmalheiro.springboot_cleanarch.infrastructure.persistence.UserEntity;

public class UserEntityMapper {
    UserEntity toEntity (User userDomainObj) {
        return new UserEntity(userDomainObj.username(), userDomainObj.email(), userDomainObj.password());
    }

    User toDomainObj (UserEntity userEntity) {
        return new User(userEntity.getUsername(), userEntity.getEmail(), userEntity.getPassword());
    }
}
