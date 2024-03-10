package com.example.mongospring.Model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Timestamp;


@Getter
@Setter
@Document(collection = "hari")
public class Post {
    private String Name;
//    private String Jwt;
//    private Timestamp timestamp;
//    private String Degree;
    private Devices devices;

    @Override
    public String toString() {
        return "Post{" +
                "Name='" + Name + '\'' +
                ", devices=" + devices +
                '}';
    }
}
