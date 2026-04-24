package com.angelaadema.sortUsingComparator;

import java.util.Comparator;

public class NameSort implements Comparator<Student> {
	
	// Override compare() and compareTo() methods
	@Override
	public int compare(Student student1, Student student2) {
		return student1.getName().compareTo(student2.getName());
	}
}
