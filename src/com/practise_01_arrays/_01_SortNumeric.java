package com.practise_01_arrays;

import java.util.Arrays;

public class _01_SortNumeric {
	
	// https://www.w3resource.com/java-exercises/array/index.php
	
	public static void main (String args [])
	{
		int a[] = {1789,2035,1899,1456,2013};
		System.out.println(Arrays.toString(a));
	//	Arrays.sort(a);
		System.out.println(Arrays.toString(a)+ " Before Sorting");
		int temp=0;
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<a.length;j++)
			{
				if(a[j]>a[i])
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
				
			}
			
		}
		System.out.println(Arrays.toString(a)+ " after sorting");
		
		
		
		
		
	}
	

}
