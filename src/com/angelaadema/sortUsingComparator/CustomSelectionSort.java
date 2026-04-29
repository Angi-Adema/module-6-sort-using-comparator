package com.angelaadema.sortUsingComparator;

// IMPORTED LIST INSTEAD OF ARRAYLIST
import java.util.Comparator;
import java.util.List;

// Use selection sort to sort the objects
public class CustomSelectionSort {

	// Sort method passing in a generic List and Comparator
	
	// OLD CODE: public static void sort(ArrayList<Student> studentList, Comparator<Student> comparator)
	
	// REFACTORED THE SORT METHOD TO USE GENERICS SO IT CAN SORT ANY LIST<T> OF OBJECTS WHEN A MATCHING
	// COMPARATOR<T> IS PROVIDED, RATHER THAN STUDENT OBJECTS ONLY. 
	// ALSO USED LIST INSTEAD OF ARRAYLIST MAKING METHOD MORE FLEXIBLE
	 public static <T> void sort(List<T> list, Comparator<T> comparator){
		
		// Store size of List in variable length
		int length = list.size();
		
		// For loop to track the position of minIndex and unsorted portion of array
		for (int i = 0; i < length - 1; i++) {
			int minIndex = i;
			
			// Inner loop searches the remaining unsorted portion of the array for the smallest value
			for (int j = i + 1; j < length; j++) {
				
				// Use comparison value returned from Comparator to determine swap of objects
				if (comparator.compare(list.get(j), list.get(minIndex)) < 0) {
					
					// Insert value of j into minIndex
					minIndex = j;
				}
			}
			
			// Logic to swap the elements, REFACTORED TO USE T AS GENERIC TYPE
			T tempIndex = list.get(minIndex);
			list.set(minIndex,  list.get(i));
			list.set(i,  tempIndex);
		}
	}
}
