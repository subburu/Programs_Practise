package com.practise_01_arrays;

public class _29_AvgExceptMaxMin {

	public static void main(String[] args) {
		
	    int[] arr = {5, 7, 2, 4, 9};
	    int max=arr[0];
	    int min =arr[0];
	    float  sum=0;
	    
	    for (int i=0;i<arr.length;i++)
	    {
	    	sum=sum+arr[i];
	    	if (arr[i]> max)
	    	{
	    		max=arr[i];
	    	}
	    	else if (arr[i]<min)
	    	{
	    		min =arr[i];
	    	}
	    }
	   
	    float  avg= (( sum=sum-max-min)/(arr.length-2));
	    System.out.println(avg+" avg");
	    
	}

}
