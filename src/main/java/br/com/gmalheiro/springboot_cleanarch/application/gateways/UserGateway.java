package br.com.gmalheiro.springboot_cleanarch.application.gateways;

import br.com.gmalheiro.springboot_cleanarch.domain.entity.User;
public interface UserGateway {
    User createUser(User user);
}
