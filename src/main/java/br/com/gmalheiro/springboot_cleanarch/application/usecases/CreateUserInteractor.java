package br.com.gmalheiro.springboot_cleanarch.application.usecases;

import br.com.gmalheiro.springboot_cleanarch.application.gateways.UserGateway;
import br.com.gmalheiro.springboot_cleanarch.domain.entity.User;

public class CreateUserInteractor {

    private final UserGateway gateway;

    public CreateUserInteractor(UserGateway gateway) {
        this.gateway = gateway;
    }

    public User createUser (User user) {
        return this.gateway.createUser(user);
    }
}
