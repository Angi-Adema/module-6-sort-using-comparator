package com.angelaadema.sortUsingComparator;

// Create the Student class to serve as a blueprint of the 
// student objects
public class Student {

	// Declare variables
	private int rollno;
	private String name;
	private String address;
	
	// Initialize variables using constructor
	Student(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	// Implement Getters
	public int getRollno() {
		return rollno;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	// Override toString() method
	@Override
	public String toString() {
		return "StudentInfo [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
	}

}
