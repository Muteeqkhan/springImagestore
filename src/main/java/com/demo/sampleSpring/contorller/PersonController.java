package com.demo.sampleSpring.contorller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.sampleSpring.Model.Person;
import com.demo.sampleSpring.request.AddNewPersonRequest;
import com.demo.sampleSpring.service.PersonService;

@RestController
public class PersonController {

	@Autowired
	PersonService personService;
	
	@PostMapping("/addnewuser")
	public String addNewUser(@RequestBody AddNewPersonRequest addNewPersonRequest) {
		return personService.addNewPerson(addNewPersonRequest);
	}
	
	@GetMapping("/getpersonByName")
	public Person getPersonByName(String name) {
		return personService.getPersonByName(name);
	}
	
	@GetMapping("/getpersonByName/{name}/{password}")
	public Person getPersonByNameAndPassword(@PathVariable String name,@PathVariable String password) {
		return personService.getPersonByNameAndPassword(name,password);
	}
	
	@GetMapping("/getPersonByNameOrPersonByName")
	public List<Person> getPersonByNameOrPersonByName(String firstPerson,String secondPerson) {
		return personService.getPersonByNameOrPersonByName(firstPerson, secondPerson);
	}
	@PutMapping("/updatePersonByName")
	public Person updatePersonByName(@RequestBody Person person) {
		return personService.updatePersonByName(person);
	}
}
