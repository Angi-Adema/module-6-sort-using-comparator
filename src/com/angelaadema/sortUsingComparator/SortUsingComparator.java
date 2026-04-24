package com.angelaadema.sortUsingComparator;

import java.util.ArrayList;

public class SortUsingComparator {

	public static void main(String[] args) {
		
		// Create an ArrayList
		ArrayList<Student> studentList = new ArrayList<>();
		
		// Add student objects to the ArrayList
		studentList.add(new Student(107, "Tammy", "Jebel Wy."));
		studentList.add(new Student(108, "Wilma", "Stone St."));
		studentList.add(new Student(104, "Joe", "Troy St."));
		studentList.add(new Student(100, "Sally", "Cobbleston Dr."));
		studentList.add(new Student(105, "Patrick", "Rodeo Dr."));
		studentList.add(new Student(102, "Dan", "Orange St."));
		studentList.add(new Student(109, "Mary", "Vaughn St."));
		studentList.add(new Student(101, "Vinnie", "Tulip St."));
		studentList.add(new Student(103, "Billie", "Decatur Cir."));
		studentList.add(new Student(106, "Robert", "Circleton St."));
		
		
		// Sort the studentList by name using CustomSelectionSort and NameSort Comparator
		CustomSelectionSort.sort(studentList, new NameSort());
		
		// Print statement to print list based on name
		System.out.println("Objects sorted by name: ");
		
		// Use enhanced for loop to loop through and print ArrayList of objects
		for (Student student : studentList) {
			System.out.println(student);
		}
		
		System.out.println();
		
		// Sort the studentList by roll number using CustomSelectionSort and RollnoSort Comparator
		CustomSelectionSort.sort(studentList,  new RollnoSort());
		
		// Print statement to print list based on roll number
		System.out.println("Objects sorted by roll number: ");
		
		// Use enhanced for loop to loop through and print ArrayList of objects
		for (Student student : studentList) {
			System.out.println(student);
		}
	}
}
