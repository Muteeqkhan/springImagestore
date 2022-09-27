package com.demo.sampleSpring.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddNewPersonRequest {
	private String personName;
	private String password;
	private String address;
}
