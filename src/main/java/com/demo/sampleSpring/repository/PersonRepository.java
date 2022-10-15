package com.demo.sampleSpring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.sampleSpring.Model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

	public Person findByPersonName(String name); // select * from person table where personname ="name"

	public Person findByPersonNameAndPassword(String personName, String password);// "select * from person table where
																					// personname =nameand password
																					// =password"

//select * from person where name=name or name="bfdj"
	public List<Person> findByPersonNameIn(List<String> names);
}
