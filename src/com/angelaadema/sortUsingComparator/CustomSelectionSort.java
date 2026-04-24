package com.angelaadema.sortUsingComparator;

import java.util.ArrayList;
import java.util.Comparator;

// Use selection sort to sort the objects
public class CustomSelectionSort {

	// Sort method passing in ArrayList of student objects and Comparator
	public static void sort(ArrayList<Student> studentList, Comparator<Student> comparator) {
		
		// Store size of ArrayList in variable length
		int length = studentList.size();
		
		// For loop to track the position of minIndex and unsorted portion of array
		for (int i = 0; i < length - 1; i++) {
			int minIndex = i;
			
			// Inner loop searches the remaining unsorted portion of the array for the smallest value
			for (int j = i + 1; j < length; j++) {
				
				// Use comparison value returned from Comparator to determine swap of objects
				if (comparator.compare(studentList.get(j), studentList.get(minIndex)) < 0) {
					
					// Insert value of j into minIndex
					minIndex = j;
				}
			}
			
			// Logic to swap the elements
			Student tempIndex = studentList.get(minIndex);
			studentList.set(minIndex,  studentList.get(i));
			studentList.set(i,  tempIndex);
		}
	}
}
