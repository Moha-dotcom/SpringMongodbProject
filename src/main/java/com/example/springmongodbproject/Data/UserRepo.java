package com.example.springmongodbproject.Data;

import com.example.springmongodbproject.Entity.Users;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends MongoRepository<Users, ObjectId> {

    Users findUsersBy_id(String id);
    Users deleteUsersBy_id(String id);
}
