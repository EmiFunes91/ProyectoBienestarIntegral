package com.BienestarIntegral.repository;

import com.BienestarIntegral.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface IUserRepository extends JpaRepository<User, Long> {
    Optional<com.BienestarIntegral.repository.User> findByUsername(String username);
}
