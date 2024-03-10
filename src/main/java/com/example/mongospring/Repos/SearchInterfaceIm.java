package com.example.mongospring.Repos;

import com.example.mongospring.Model.Post;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.convert.MongoConverter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class SearchInterfaceIm implements SearchInterface{

    @Autowired
    MongoClient client;

    @Autowired
    MongoConverter converter;
    @Override
    public List<Post> findBytext(String text) {
        final List<Post> posts = new ArrayList<>();

        MongoDatabase database = client.getDatabase("Hari");
        MongoCollection<Document> collection = database.getCollection("hari");
        AggregateIterable<Document> result = collection.aggregate(Arrays.asList(new Document("$search",
                        new Document("text",
                                new Document("query", text)
                                        .append("path", "Name"))),
                new Document("$sort",
                        new Document("exp", 1L))));

        result.forEach(document -> posts.add(converter.read(Post.class,document)));

        return posts;
    }
}
