package com.maveric.userservice.service;

import com.maveric.userservice.controller.UserController;
import com.maveric.userservice.model.User;

public interface UserService  {
    User createPost(User user);
}
