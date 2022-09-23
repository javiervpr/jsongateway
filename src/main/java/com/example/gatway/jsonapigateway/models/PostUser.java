package com.example.gatway.jsonapigateway.models;

import java.io.Serializable;
import java.util.List;

public class PostUser implements Serializable {
    public float id;
    public String name;
    public String username;
    public String email;
    public List<Post> posts;
}
