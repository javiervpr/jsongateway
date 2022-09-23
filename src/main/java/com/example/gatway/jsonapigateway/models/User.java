package com.example.gatway.jsonapigateway.models;

import java.io.Serializable;

public class User implements Serializable {
    public float id;
    public String name;
    public String username;
    public String email;

    public class Company implements Serializable  {
        public String name;
        public String catchPhrase;
        public String bs;

        public Company(String name, String catchPhrase, String bs) {
            this.name = name;
            this.catchPhrase = catchPhrase;
            this.bs = bs;
        }
    }

    public class Address implements Serializable  {
        public String street;
        public String suite;
        public String city;
        public String zipcode;
        public Geo geo;

        public Address(String street, String suite, String city, String zipcode, Geo geo) {
            this.street = street;
            this.suite = suite;
            this.city = city;
            this.zipcode = zipcode;
            this.geo = geo;
        }
    }

    public class Geo implements Serializable  {
        public String lat;
        public String lng;

        public Geo(String lat, String lng) {
            this.lat = lat;
            this.lng = lng;
        }
    }
}
