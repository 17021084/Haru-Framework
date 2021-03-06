package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.example.demo.dao.PersonDao;
import com.example.demo.model.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;



@Service
public class PersonService {
    
    private final PersonDao personDao;
  
    @Autowired             //@qulifier("fakeDao")
    public PersonService ( @Qualifier("Postgres")  PersonDao personDao){
        this.personDao= personDao;
    }

    public int addPerson (Person person ){
        return personDao.insertPerson( person);
    }
    
    public List<Person> getAllPeople(){
        return personDao.selectAllPeople();
    }
    public Optional <Person> getPersonbyId(UUID id) {
        return personDao.selectPersonbyId(id);
    }

    public int deletePerson(UUID id){
        return personDao.deletePersonById(id);

    }
    public int updatePerson(UUID id , Person newPerson){
        return personDao.updatePersonByOd(id, newPerson);
    }
}