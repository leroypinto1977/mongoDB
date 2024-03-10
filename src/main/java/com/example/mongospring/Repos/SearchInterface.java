package com.example.mongospring.Repos;

import com.example.mongospring.Model.Post;

import java.util.List;

public interface SearchInterface {
    List<Post> findBytext(String text);
}
