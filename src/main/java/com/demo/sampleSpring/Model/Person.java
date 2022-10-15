package com.demo.sampleSpring.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity // specify that this is an databse table
@NoArgsConstructor
@AllArgsConstructor
public class Person implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int personId;
	private String personName;
	private String password;
	private String address;
	
	
}
