package com.example.demo.service;

import com.example.demo.dao.PersonDao;
import com.example.demo.model.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;



@Service
public class PersonService {
    
    private final PersonDao PersonDao;

    @Autowired
    public PersonService ( @Qualifier("fakeDao")  PersonDao personDao){
        this.PersonDao= personDao;
    }

    public int addPerson (Person person ){
        return PersonDao.insertPerson( person);
    }
}