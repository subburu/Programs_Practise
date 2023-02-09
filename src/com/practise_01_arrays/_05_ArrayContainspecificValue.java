package com.practise_01_arrays;

public class _05_ArrayContainspecificValue {

	public static void main(String args []) {

		int a [] = {1789,2035,1899,1456,2013};
		contains(a,2013);
		System.out.println(contains(a,2013));
		System.out.println(contains(a,2023));
	}
	
	
	public static boolean  contains(int a[],int num)
	{
     
		
		for (int i=0;i<a.length;i++)
		{
			if (a[i]==num)
			{
				return true;
			}
			
		}
		return false;
		
		
	}

}
