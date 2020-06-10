package com.example.demo.dao;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.example.demo.model.Person;

import org.springframework.stereotype.Repository;

@Repository("Postgres")
public class PersonDataAccessService implements PersonDao  {

	@Override
	public int insertPerson(UUID id, Person person) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Person> selectAllPeople() {
        return null;
        // from java 9, List.of is avalible 
		// return  List.of(new Person(UUID.randomUUID(),"FROM POSTGRES DB"));
	}

	@Override
	public Optional<Person> selectPersonbyId(UUID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public int deletePersonById(UUID id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updatePersonByOd(UUID id, Person person) {
		// TODO Auto-generated method stub
		return 0;
	}
    
}