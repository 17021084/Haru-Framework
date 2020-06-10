package com.example.demo.model;

import java.util.UUID;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {
   
  
    @NotBlank
    private final String name;
    
    private final UUID id;

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