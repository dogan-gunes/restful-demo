package com.dgn.restful_demo.controller;

import com.dgn.restful_demo.dto.AddUserRequest;
import com.dgn.restful_demo.model.User;
import com.dgn.restful_demo.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/getAllUsers")
    public ResponseEntity<List<User >> getAllUsers(){
        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
    }
    @GetMapping("/getUserById/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id){
        return new ResponseEntity<>(userService.getUserById(id),HttpStatus.OK);
    }
    @PostMapping("/addUser")
    public ResponseEntity<User> addUser(@RequestBody AddUserRequest addUserRequest){
        return new ResponseEntity<>(userService.addUser(addUserRequest),HttpStatus.CREATED);
    }
}
