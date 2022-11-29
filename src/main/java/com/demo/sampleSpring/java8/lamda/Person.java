package com.demo.sampleSpring.java8.lamda;

public class Person {

	
	private int adharNo;
	private String name;
	private String address;
	private String fathername;
	
	public int getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(int adharNo) {
		this.adharNo = adharNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFathername() {
		return fathername;
	}

	public void setFathername(String fathername) {
		this.fathername = fathername;
	}

	public Person() {
		super();
	}

	public Person(int adharNo, String name, String address, String fathername) {
		super();
		this.adharNo = adharNo;
		this.name = name;
		this.address = address;
		this.fathername = fathername;
	}

	@Override
	public String toString() {
		return "Person [adharNo=" + adharNo + ", name=" + name + ", address=" + address + ", fathername=" + fathername
				+ "]";
	}
	
	
	
	
}
