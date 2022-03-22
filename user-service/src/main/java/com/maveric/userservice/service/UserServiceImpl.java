package com.maveric.userservice.service;

import com.maveric.userservice.model.User;
import com.maveric.userservice.repo.UserRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    //private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    UserRepo userRepo;

    @Override
    public User createPost(User user) {
        //logger.info("user creating a post");
        return userRepo.save(user);
    }


//    @Override
//    public User createPost(User user) {
//        logger.info("user creating a post");
//        return userRepo.save(user);
//    }
}
