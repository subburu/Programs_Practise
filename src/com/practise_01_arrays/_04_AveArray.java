package com.practise_01_arrays;

public class _04_AveArray {

	public static void main (String args [])
	{

	    int[] a = new int[]{20, 30, 25, 35, -16, 60, -100};

		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			
		}
		float avg =(sum/a.length);
		System.out.println("Average is "+ avg);
		
		
		
	}

}
