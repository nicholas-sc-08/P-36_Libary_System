package br.com.lbs.libary_system.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.lbs.libary_system.model.User;

@Repository
public interface UserRepo extends CrudRepository<User, Integer>  {
    public User findByEmail(String email);
}