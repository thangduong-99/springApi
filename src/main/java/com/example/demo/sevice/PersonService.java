package com.example.demo.sevice;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Person;

public interface PersonService extends CrudRepository<Person, Integer>{
	List<Person> findAll();
	Person save(Person person);
}
