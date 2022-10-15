package com.demo.sampleSpring.service;

import java.util.List;

import com.demo.sampleSpring.Model.Person;
import com.demo.sampleSpring.request.AddNewPersonRequest;

public interface PersonService {

	public String addNewPerson(AddNewPersonRequest addNewPersonRequest);
	public Person getPersonByName(String name);
	public Person getPersonByNameAndPassword(String name,String password);
	public List<Person> getPersonByNameOrPersonByName(String name,String personname);
	public Person updatePersonByName( Person person);
}
