package com.maveric.userservice.controller;

import com.maveric.userservice.model.User;
import com.maveric.userservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("/users")

public class UserController {
    @Autowired
    UserService userService;

   // private static Logger logger = (Logger) LoggerFactory.getLogger(UserController.class);

    @PostMapping("/user-new")

    public ResponseEntity<User> createPost(@RequestBody  User user){
       // logger.info("user creating a post");
        return new ResponseEntity<User>(userService.createPost(user), HttpStatus.CREATED);

    }




}
