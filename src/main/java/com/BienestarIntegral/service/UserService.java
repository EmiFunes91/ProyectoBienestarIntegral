package com.BienestarIntegral.service;

import com.BienestarIntegral.model.UserModel;
import com.BienestarIntegral.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private IUserRepository userRepository;

    public Optional<UserModel> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public UserModel save(UserModel user) {
        return userRepository.save(user);
    }
}
