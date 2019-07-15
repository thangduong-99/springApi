package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="person")
@Entity
public class Person  {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="personid",nullable=false)
	private Integer personId;
	@Column(name="name",nullable=false)
	private String name;
	@Column(name="address",nullable=false)
	private String address;
	@Column(name="phone",nullable=false)
	private String phone;
	@Column(name="age",nullable=false)
	private Integer age;
	public Integer getPersonId() {
		return personId;
	}
	public void setPersonId(Integer personId) {
		this.personId = personId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Person(Integer personId, String name, String address, String phone, Integer age) {
		super();
		this.personId = personId;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.age = age;
	}
	public Person() {
		super();
	}
	
	
}
