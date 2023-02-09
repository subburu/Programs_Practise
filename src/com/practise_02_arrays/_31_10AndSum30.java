package com.practise_02_arrays;

public class _31_10AndSum30 {

	public static void main(String[] args) {

	    int[] arr = {10, 77, 10, 54, -11, 10};
	    int[] arr1 = {10, 77, 10, 54, -11, 10,10};
	    System.out.println("First output------");
	    checkSum(arr,30);
	    System.out.println("Second output------");
	    checkSum(arr1,30);
	}
	    public static boolean checkSum (int arr[], int givensum)
	    {
	    	
	    	int expectedsum=0;
	    	boolean checkSum=true;
		    for (int i=0;i<arr.length;i++)
		    {
		    	if (arr[i]==10)
		    	{
		    		expectedsum=expectedsum+arr[i];
		    	}
		    }
		    System.out.println(expectedsum +" expectedsum");
		    System.out.println(givensum +" givensum");

		    if (expectedsum==givensum)
		    {
		    	checkSum=true;
		    }
		    else
		    {
		    	checkSum=false;
		    
		    }
		    System.out.println(checkSum);
			return checkSum;
	    }

}
