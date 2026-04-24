package com.angelaadema.sortUsingComparator;

import java.util.ArrayList;
import java.util.Comparator;

// Use selection sort to sort the objects
public class CustomSelectionSort {

	// Sort method passing in ArrayList of student objects and Comparator
	public static void sort(ArrayList<Student> studentList, Comparator<Student> comparator) {
		
		// Set length of array to variable length
		int length = studentList.size();
		
		// For loop to track the position of the key index and unsorted portion of array
		for (int i = 0; i < length - 1; i++) {
			int key = i;
			
			// Inner loop to track second value (j) being compared to i
			for (int j = i + 1; j < length; j++) {
				
				// Use comparison value returned from Comparator to determine swap of objects
				if (comparator.compare(studentList.get(j), studentList.get(key)) < 0) {
					
					// Insert value of j into key index
					key = j;
				}
			}
			
			// Logic to swap the elements
			Student tempIndex = studentList.get(key);
			studentList.set(key,  studentList.get(i));
			studentList.set(i,  tempIndex);
		}
	}
}
