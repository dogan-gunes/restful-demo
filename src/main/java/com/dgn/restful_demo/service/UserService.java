package com.dgn.restful_demo.service;

import com.dgn.restful_demo.dto.AddUserRequest;
import com.dgn.restful_demo.model.User;
import com.dgn.restful_demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User addUser(AddUserRequest addUserRequest){
        User user1= new User(addUserRequest.getName(), addUserRequest.getSurName());
        return userRepository.save(user1);
    }

    public User getUserById(Long id){
        return userRepository.findById(id).orElse(null);
    }
}
