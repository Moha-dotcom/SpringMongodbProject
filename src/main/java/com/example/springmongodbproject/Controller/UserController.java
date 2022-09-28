package com.example.springmongodbproject.Controller;


import com.example.springmongodbproject.Entity.Users;
import com.example.springmongodbproject.Service.UserService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService service;


    @GetMapping
    public List<Users> getallUsers(){
        return service.getallUsers();
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id){

        service.deleteUser(id);
    }
}
