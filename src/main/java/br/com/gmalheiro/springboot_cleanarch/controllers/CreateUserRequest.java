package br.com.gmalheiro.springboot_cleanarch.controllers;

public record CreateUserRequest (String username, String password, String email)  {
}
