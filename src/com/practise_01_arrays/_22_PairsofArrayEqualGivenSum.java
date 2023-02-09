package com.practise_01_arrays;

public class _22_PairsofArrayEqualGivenSum {

	
	public static void main (String args [])
	{
	int b[] = {2, 7, 4, -5, 11, 5, 20};
	 int a[] ={14, -15, 9, 16, 25, 45, 12, 8};
	int sum =30;
	
	for (int i=0;i<a.length;i++)
	{
		for (int j=i+1;j<a.length;j++)
		{
			if (a[i]+a[j]==sum)
			{
			  System.out.println(a[i]+"+"+a[j] +" =" +sum);
			}
		}
	}

	}
}
