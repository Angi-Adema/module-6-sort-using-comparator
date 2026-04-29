package com.angelaadema.sortUsingComparator;

import java.util.Comparator;

// Use Comparator to set the ordering rule 
public class NameSort implements Comparator<Student> {
	
	// Override compare() and use .compareTo() to compare the names
	// The result will then be used by the chosen sort algorithm to order the objects
	@Override
	public int compare(Student o1, Student o2) {
		
		// Compare student names alphabetically using .compareTo()
		return o1.getName().compareTo(o2.getName());
	}
}
  