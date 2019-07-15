package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Person;
import com.example.demo.sevice.PersonService;

@RestController
@RequestMapping("/")
public class PersonController {
	@Autowired
	private PersonService personService;
	@GetMapping("person")
	public ResponseEntity<?> getAllPerson(){
		List<Person> list = personService.findAll();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
	@PostMapping("insert")
	public ResponseEntity<Person> insertNewPerson(@RequestBody Person person){
		person = new Person(2, "CongThang", "HaiDuong", "123123", 23);
		return new ResponseEntity<>(person,HttpStatus.OK);
	}
}
