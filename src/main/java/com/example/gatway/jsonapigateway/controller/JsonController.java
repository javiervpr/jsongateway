package com.example.gatway.jsonapigateway.controller;

import com.example.gatway.jsonapigateway.models.Post;
import com.example.gatway.jsonapigateway.models.PostUser;
import com.example.gatway.jsonapigateway.models.User;
import com.example.gatway.jsonapigateway.services.JsonPlaceHolderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/jsonplaceholder")
public class JsonController {

    Logger logger = LoggerFactory.getLogger(JsonController.class);
    private final JsonPlaceHolderService jsonPlaceHolderService;

    public JsonController(JsonPlaceHolderService jsonPlaceHolderService) {
        this.jsonPlaceHolderService = jsonPlaceHolderService;
    }

    @GetMapping("/user-posts")
    public List<PostUser> test() {
        User[] users = jsonPlaceHolderService.getUsers();
        Post[] post = jsonPlaceHolderService.getPosts();
        List<PostUser> postUsers = new ArrayList<>();
        Arrays.stream(users).forEach(user -> {
            PostUser postUser = new PostUser();
            postUser.id = user.id;
            postUser.username = user.username;
            postUser.email = user.email;
            postUser.name = user.name;
            postUser.posts = Arrays.stream(post).filter(p -> p.userId == user.id).toList();
            postUsers.add(postUser);
        });
        return postUsers;
    }
}
