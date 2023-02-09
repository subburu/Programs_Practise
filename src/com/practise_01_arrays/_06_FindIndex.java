package com.practise_01_arrays;

public class _06_FindIndex {

	public static void main(String args[]) {

		findIndex();
		}
		
	public static boolean findIndex()
	{
		int [] arr= {25,14,56,15,36};  // try for number not available
		
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]==36)
			{
			
				System.out.println(i +" is the index of given number");
				
			}
			
			
		}

		return false;

	}}
