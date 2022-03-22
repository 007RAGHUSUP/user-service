package com.userservice.repo;
import com.userservice.model.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<UserModel, String> {
}
