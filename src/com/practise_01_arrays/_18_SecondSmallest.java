package com.practise_01_arrays;

public class _18_SecondSmallest {
	
	
	public static void main (String args [])
	{
    int a[] = {1, 4, 0, 2, 7, 3,1,1,0,0,0};
    int smallest =a[0];
    for (int i=0;i<a.length;i++)
    {
    	if (a[i]<smallest)
    	{
    		smallest=a[i];
    	}
    }
    System.out.println(smallest+ " smallest values");
    int secondSmallest =a[0];
    
    for (int i=0;i<a.length;i++)
    {
    	if (a[i]<smallest && a[i]<secondSmallest)
    	{
    		secondSmallest=a[i];
    	}
    }
    System.out.println(secondSmallest+ " is the second smallest ");
	}
    

}
