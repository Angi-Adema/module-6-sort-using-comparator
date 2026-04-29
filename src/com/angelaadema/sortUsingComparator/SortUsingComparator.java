package com.angelaadema.sortUsingComparator;

import java.util.ArrayList;
import java.util.List;

public class SortUsingComparator {

	public static void main(String[] args) {
		
		// REFACTORED TO USE LIST AS TYPE INSTEAD OF ARRAYLIST AND MOVED INTO HELPER METHOD
		// Create an ArrayList
		//List<Student> studentList = new ArrayList<>();
		List<Student> studentList = createStudentList();
		
		// REFACTORED INTO HELPER METHOD
		// Add student objects to the ArrayList
//		studentList.add(new Student(107, "Tammy", "Jebel Wy."));
//		studentList.add(new Student(108, "Wilma", "Stone St."));
//		studentList.add(new Student(104, "Joe", "Troy St."));
//		studentList.add(new Student(100, "Sally", "Cobbleston Dr."));
//		studentList.add(new Student(105, "Patrick", "Rodeo Dr."));
//		studentList.add(new Student(102, "Dan", "Orange St."));
//		studentList.add(new Student(109, "Mary", "Vaughn St."));
//		studentList.add(new Student(101, "Vinnie", "Tulip St."));
//		studentList.add(new Student(103, "Billie", "Decatur Cir."));
//		studentList.add(new Student(106, "Robert", "Circleton St."));
		
		
		// Sort the studentList by name using CustomSelectionSort and NameSort Comparator
		CustomSelectionSort.sort(studentList, new NameSort());
		
		// Print statement to print list based on name
		System.out.println("Objects sorted by name: ");
		
		// REFACTORED PRINTING INTO A HELPER FUNCTION ELIMINATING REPEATED LOOPS
		// Use enhanced for loop to loop through and print ArrayList of objects
//		for (Student student : studentList) {
//			System.out.println(student);
//		}
		
		// NEW PRINT STATEMENT
		printStudentList(studentList);
		
		System.out.println();
		
		// Sort the studentList by roll number using CustomSelectionSort and RollnoSort Comparator
		CustomSelectionSort.sort(studentList,  new RollnoSort());
		
		// Print statement to print list based on roll number
		System.out.println("Objects sorted by roll number: ");
		
		// REFACTORED TO ELIMINATE MULTIPLE PRINT LOOPS
		// Use enhanced for loop to loop through and print ArrayList of objects
//		for (Student student : studentList) {
//			System.out.println(student);
//		}
		
		// REUSE PRINT STATEMENT ABOVE
		printStudentList(studentList);
	}
	
	// REFACTORED TO ADD NEW HELPER METHOD OUTSIDE OF THE MAIN METHOD TO 
	// CREATE & RETURN STUDENT OBJECT LIST
	public static List<Student> createStudentList() {
		
		// NEW ArrayList holding student objects
		List<Student> studentList = new ArrayList<>();
		
		// Add student objects into the ArrayList
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
		
		// Return the studentList
		return studentList;
	}
	
	// REFACTORED NEW PRINT METHOD WITH SINGLE LOOP FOR REUSE TO PRINT STUDENT LIST
	public static void printStudentList(List<Student> studentList) {
		
		// Loop through the studentList using enhanced for loop and print full list
		for (Student student : studentList) {
			System.out.println(student);
		}
	}
}
