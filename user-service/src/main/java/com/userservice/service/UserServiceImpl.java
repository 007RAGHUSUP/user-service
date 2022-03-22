package com.userservice.service;

import com.userservice.model.UserModel;
import com.userservice.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    //private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    UserRepo userRepo;

    @Override
    public UserModel createPost(UserModel user) {
        //logger.info("user creating a post");
        return userRepo.save(user);
    }


//    @Override
//    public User createPost(User user) {
//        logger.info("user creating a post");
//        return userRepo.save(user);
//    }
}
