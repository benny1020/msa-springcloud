package com.example.userservice.repository;

import com.example.userservice.jpa.UserEntity;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {

    Optional<UserEntity> findByUserId(String userId);
}
