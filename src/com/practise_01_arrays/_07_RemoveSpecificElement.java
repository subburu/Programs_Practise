package com.practise_01_arrays;

import java.util.Arrays;

public class _07_RemoveSpecificElement {

	// remove 36
	
	public static void main(String[] args) {

		   int[] arr = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		   System.out.println("Original Array : "+Arrays.toString(arr));     
		   int removeIndex = 1;
		   for(int i = removeIndex; i < arr.length -1; i++){
		        arr[i] = arr[i + 1];
		      }
		    System.out.println("After removing the second element: "+Arrays.toString(arr));


		
		
		
	}

}
