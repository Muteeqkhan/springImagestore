package com.demo.sampleSpring.service.impl;

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
	
	

}

