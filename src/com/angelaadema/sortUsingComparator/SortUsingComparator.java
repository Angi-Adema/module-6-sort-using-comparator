package com.angelaadema.sortUsingComparator;

import java.util.ArrayList;

public class SortUsingComparator {

	public static void main(String[] args) {
		
		// Create an ArrayList
		ArrayList<Student> studentList = new ArrayList<>();
		
		// Add student objects to the ArrayList
		studentList.add(new Student(100, "Sally", "Cobbleston Dr."));
		studentList.add(new Student(100, "Vinnie", "Tulip St."));
		studentList.add(new Student(100, "Dan", "Orange St."));
		studentList.add(new Student(100, "Billie", "Decatur Cir."));
		studentList.add(new Student(100, "Joe", "Troy St."));
		studentList.add(new Student(100, "Patrick", "Rodeo Dr."));
		studentList.add(new Student(100, "Robert", "Circleton St."));
		studentList.add(new Student(100, "Tammy", "Jebel Wy."));
		studentList.add(new Student(100, "Wilma", "Stone St."));
		studentList.add(new Student(100, "Mary", "Vaughn St."));
	}

}
