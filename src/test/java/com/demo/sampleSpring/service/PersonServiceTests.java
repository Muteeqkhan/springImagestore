package com.demo.sampleSpring.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.demo.sampleSpring.Model.Person;
import com.demo.sampleSpring.repository.PersonRepository;
import com.demo.sampleSpring.request.AddNewPersonRequest;
import com.demo.sampleSpring.service.impl.PersonImplementation;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTests {

	
	@Mock
	PersonRepository personRepository;
	
	@InjectMocks
	PersonImplementation implementation;
	static AddNewPersonRequest	 addNewPersonRequest=null;
	
	@BeforeAll
	static void setup(){
		addNewPersonRequest=new AddNewPersonRequest("muteeq", "khan", "mysore");
	}
	
	
	@Test
	public void addNewPersonPositive() {
		when(personRepository.findByPersonName(any())).thenReturn(null);
		String addNewPerson = implementation.addNewPerson(addNewPersonRequest);
		assertEquals("useradded sucessfully", addNewPerson);
	}
	
	@Test
	public void addNewPersonNegative() {
		when(personRepository.findByPersonName(any())).thenReturn(new Person());
		assertThrows(RuntimeException.class, ()->implementation.addNewPerson(addNewPersonRequest));
		}
	
	
	
}
