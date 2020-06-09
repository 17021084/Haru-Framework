package com.example.demo.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {
    private final UUID id;
    private final String name;

    //The POST data format is JSON so we need Anotation @JsonProperty
    

    public Person(@JsonProperty("id") UUID id, 
                  @JsonProperty("name")  String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
    
    
}