package br.com.teste.repository;

import br.com.teste.datasource.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
