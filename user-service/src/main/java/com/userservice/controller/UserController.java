package com.userservice.controller;

import com.userservice.model.UserModel;
import com.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    public ResponseEntity<UserModel> createPost(@RequestBody UserModel user){
       // logger.info("user creating a post");
        return new ResponseEntity<UserModel>(userService.createPost(user), HttpStatus.CREATED);

    }




}
