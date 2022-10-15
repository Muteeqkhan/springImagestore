package com.demo.sampleSpring.service.impl;

import java.util.Arrays;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.sampleSpring.Model.Person;
import com.demo.sampleSpring.repository.PersonRepository;
import com.demo.sampleSpring.request.AddNewPersonRequest;
import com.demo.sampleSpring.service.PersonService;



@Service
public class PersonImplementation implements PersonService{
	
	
	@Autowired
	PersonRepository personRepository;

	@Override
	public String addNewPerson(AddNewPersonRequest addNewPersonRequest) {
		String personName = addNewPersonRequest.getPersonName();
		Person findByPersonName = personRepository.findByPersonName(personName);
		if(findByPersonName==null) { //posive
			Person person=new Person();
			person.setPersonName(addNewPersonRequest.getPersonName());
			person.setPassword(addNewPersonRequest.getPassword());
			person.setAddress(addNewPersonRequest.getAddress());
			personRepository.save(person);
			return "useradded sucessfully";
		}else { //negative
			throw new RuntimeException("already exist");
		}
		
	}

	//finding the person by his name
	@Override
	public Person getPersonByName(String name) {
		
		return personRepository.findByPersonName(name);
	}

	@Override
	public Person getPersonByNameAndPassword(String name, String password) {
		// TODO Auto-generated method stub
		return personRepository.findByPersonNameAndPassword(name, password);
	}

	@Override
	public List<Person> getPersonByNameOrPersonByName(String name, String personname) {
		
		List<String> names=Arrays.asList(name,personname);
		return personRepository.findByPersonNameIn(names);
	}

	@Override
	@Transactional
	public Person updatePersonByName(Person person) {
		Person personObject = personRepository.findByPersonName(person.getPersonName()); //curently in the db
		//now updating
		personObject.setAddress(person.getAddress());
		personObject.setPassword(person.getPassword());
		return personObject;
		
	}
	
	

}

