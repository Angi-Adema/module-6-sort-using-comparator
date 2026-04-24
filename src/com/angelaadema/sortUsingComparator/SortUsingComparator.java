package com.angelaadema.sortUsingComparator;

import java.util.ArrayList;

public class SortUsingComparator {

	public static void main(String[] args) {
		
		// Create an ArrayList
		ArrayList<Student> studentList = new ArrayList<>();
		
		// Add student objects to the ArrayList
		studentList.add(new Student(100, "Sally", "Cobbleston Dr."));
		studentList.add(new Student(101, "Vinnie", "Tulip St."));
		studentList.add(new Student(102, "Dan", "Orange St."));
		studentList.add(new Student(103, "Billie", "Decatur Cir."));
		studentList.add(new Student(104, "Joe", "Troy St."));
		studentList.add(new Student(105, "Patrick", "Rodeo Dr."));
		studentList.add(new Student(106, "Robert", "Circleton St."));
		studentList.add(new Student(107, "Tammy", "Jebel Wy."));
		studentList.add(new Student(108, "Wilma", "Stone St."));
		studentList.add(new Student(109, "Mary", "Vaughn St."));
	}

}
