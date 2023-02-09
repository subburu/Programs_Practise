package com.practise_01_arrays;

public class _27_NumberOfEvensOdds {

	public static void main(String[] args) {
		
	    int[] arr = {5, 7, 2, 4, 9,19,21,20};
         int evencount=0;
         int oddcount=0;
	    for (int i=0;i<arr.length;i++)
	    {
	    	if (arr[i]%2==0)
	    	{
	    		evencount++;
	    	}
	    	else
	    	{
	    		oddcount++;
	    		
	    	}
	    }
	    System.out.println("Number of even numbers "+evencount);
	    System.out.println("Number of odd numbers "+oddcount);

	}

}
