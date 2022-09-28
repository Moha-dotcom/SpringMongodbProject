package com.example.springmongodbproject.Entity;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Data
@Document

public class Users {


    @org.springframework.data.annotation.Id
    public Id _id; // Reason for No converter found capable of converting from type [org.bson.types.ObjectId]
    @Field
    public String name;
    @Field
    public String email;
    @Field
    public String password;

    public ObjectId get_id() {

        return _id.getId();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }


}
