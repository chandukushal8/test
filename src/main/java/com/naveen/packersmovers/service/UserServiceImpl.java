package com.chandu.userform.service;

import org.springframework.stereotype.Service;
import com.chandu.userform.model.User;
import com.chandu.userform.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
