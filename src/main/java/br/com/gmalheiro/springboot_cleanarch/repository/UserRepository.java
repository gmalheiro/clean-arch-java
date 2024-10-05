package br.com.gmalheiro.springboot_cleanarch.repository;

import br.com.gmalheiro.springboot_cleanarch.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {

}
