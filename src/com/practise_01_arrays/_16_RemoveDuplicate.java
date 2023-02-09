package com.practise_01_arrays;

import java.util.Arrays;

public class _16_RemoveDuplicate {

	public static void main(String[] args) {
		
		int arr[] = {10, 22, 10, 20, 11, 22};
	    int unique = arr.length;
	 		
		for (int i=0;i<arr.length;i++)
		{
			
		
			for  (int j=0;j<arr.length;j++)
			{
				if (arr[i]==arr[j])
				{
					arr[j]=arr[unique-1];
					unique--;
					j--;
					
				}
			}
			
	    int[] array1 = Arrays.copyOf(arr, unique);

			
	    
			
			
		}
		

	}

}
