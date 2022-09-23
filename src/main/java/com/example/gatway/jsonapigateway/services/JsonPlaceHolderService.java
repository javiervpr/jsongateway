package com.example.gatway.jsonapigateway.services;

import com.example.gatway.jsonapigateway.models.Post;
import com.example.gatway.jsonapigateway.models.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class JsonPlaceHolderService {

    private final RestTemplate restTemplate;

    @Value("${base.url}")
    private String baseUrl;

    public JsonPlaceHolderService() {
        this.restTemplate = new RestTemplateBuilder().build();
    }

    public Post[] getPosts() {
        String url = baseUrl + "/posts";
        return this.restTemplate.getForObject(url, Post[].class);
    }

    public User[] getUsers() {
        String url = baseUrl + "/users";
        return this.restTemplate.getForObject(url, User[].class);
    }

}
