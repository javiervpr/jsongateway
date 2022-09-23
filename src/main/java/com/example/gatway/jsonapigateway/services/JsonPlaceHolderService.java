package com.example.gatway.jsonapigateway.services;

import com.example.gatway.jsonapigateway.models.Post;
import com.example.gatway.jsonapigateway.models.User;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class JsonPlaceHolderService {

    private final RestTemplate restTemplate;

    public JsonPlaceHolderService() {
        this.restTemplate = new RestTemplateBuilder().build();
    }

    public Post[] getPosts() {
        String url = "https://jsonplaceholder.typicode.com/posts";
        return this.restTemplate.getForObject(url, Post[].class);
    }

    public User[] getUsers() {
        String url = "https://jsonplaceholder.typicode.com/users";
        return this.restTemplate.getForObject(url, User[].class);
    }

}
