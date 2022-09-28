package com.example.springmongodbproject.Service;


import com.example.springmongodbproject.Data.UserRepo;
import com.example.springmongodbproject.Entity.Users;
import org.apache.logging.log4j.message.Message;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepo repo;


    public List<Users> getallUsers(){
        return repo.findAll();
    }



    public Users addUser(Users users){
       if(users._id.getId() == null){
//           throw new RuntimeException("User Id:  null" + "User id is an ObjectId");
       }
       return repo.save(users);

    }


    public void deleteUser(String id){
      repo.delete(repo.findUsersBy_id(id));

    }
}
