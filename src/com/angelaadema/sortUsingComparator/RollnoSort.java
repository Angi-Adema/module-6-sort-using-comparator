package com.angelaadema.sortUsingComparator;

import java.util.Comparator;

// Use Comparator to set the ordering rule
public class RollnoSort implements Comparator<Student> {
	
	// Override compare() and use Integer.compare() to compare roll numbers
	// The result will be used by the chosen sort algorithm to order the objects
	@Override
	public int compare(Student o1, Student o2) {
		
		// Compare roll number by using Integer.compare()
		return Integer.compare(o1.getRollno(), o2.getRollno());
	}
}
