package com.angelaadema.sortUsingComparator;

import java.util.Comparator;

public class RollnoSort implements Comparator<Student> {
	
	// Override compare() and compareTo() methods
	@Override
	public int compare(Student student1, Student student2) {
		return Integer.compare(student1.getRollno(), student2.getRollno());
	}
}
