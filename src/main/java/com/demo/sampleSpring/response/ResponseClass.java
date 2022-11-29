package com.demo.sampleSpring.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseClass<T> {

	
	private T  response;

	private String name;

	
}
