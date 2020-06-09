package com.example.demo.api;

import java.util.List;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RequestMapping("api/v1/person")  //Defined first endpoint
@RestController
public class PersonController {
    public final PersonService personService;

    @Autowired 
    public PersonController(PersonService personService){
        this.personService= personService;
    }
    

    @PostMapping    //defined Path
    //Get Body of Req 
    public void addPerson(@RequestBody Person person){
        personService.addPerson(person);
    }

    @GetMapping
    public List<Person> getAllPeople(){
        return personService.getAllPeople();
    }

  
}