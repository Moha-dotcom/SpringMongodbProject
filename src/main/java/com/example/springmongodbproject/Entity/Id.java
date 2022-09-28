package com.example.springmongodbproject.Entity;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Data
@Document
public class Id{

    @org.springframework.data.annotation.Id
    public ObjectId id;
}