package com.dev.repository;
import org.springframework.data.repository.CrudRepository;

import com.dev.model.UserDao;
public interface UserRepository extends CrudRepository<UserDao, Integer> {
    UserDao findByUsername(String username);
}