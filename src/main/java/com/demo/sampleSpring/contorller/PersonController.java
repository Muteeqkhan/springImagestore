package com.demo.sampleSpring.contorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.sampleSpring.request.AddNewPersonRequest;
import com.demo.sampleSpring.service.PersonService;

@RestController
public class PersonController {

	@Autowired
	PersonService personService;
	
	@GetMapping("/addnewuser")
	public String addNewUser(@RequestBody AddNewPersonRequest addNewPersonRequest) {
		return personService.addNewPerson(addNewPersonRequest);
	}
}
