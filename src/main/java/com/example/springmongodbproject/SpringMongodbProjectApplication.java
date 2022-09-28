package com.example.springmongodbproject;


import com.example.springmongodbproject.Data.UserRepo;
import com.example.springmongodbproject.Entity.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class SpringMongodbProjectApplication  implements CommandLineRunner {

//    @Autowired
//    ThreaterRepo repo;
    @Autowired
    UserRepo service;


    public static void main(String[] args) {
        SpringApplication.run(SpringMongodbProjectApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {



        service.save(new Truck("12" ,new Id(), "Ahmed"));

//
//        Query query = new Query();;
//        query.addCriteria(Criteria.where("name").is("Mohamed Abdullahi"));
//
//
//        System.out.println( query.addCriteria(Criteria.where("name").is("Mohamed Abdullahi")));
//
//
//

//        Users users = new Users(new Id(), "Prof Jamac Hussein", "JamacHussein@gmail.com", "g04ZJU&6p5v21dhRjXak27QQgB^LbWU8ti%BE");
//
//        System.out.println(service.addUser(users));
//
//
//        List<Users> user = service.getallUsers();
//
//        Map<ObjectId, String> a = user.stream().collect(Collectors.toMap(Users::get_id, Users::getName));
//
//
//
//        for(Map.Entry<ObjectId, String> ak : a.entrySet()){
//            System.out.println(ak.getKey() + " " + ak.getValue());
//        }




//        System.out.println(repo.findUsersBy_id("59b99dfbcfa9a34dcd78864f"));


    }
}
