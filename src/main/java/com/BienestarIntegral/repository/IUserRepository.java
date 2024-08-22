package com.BienestarIntegral.repository;

import com.BienestarIntegral.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface IUserRepository extends JpaRepository<UserModel, Long> {
    Optional<com.BienestarIntegral.model.UserModel> findByUsername(String username);
}
