package com.a133beta.repo;

import com.a133beta.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends CrudRepository<User,Long> {
    public Optional<User>  findByUsername(String username);
}
