package com.practise_01_arrays;

public class _23_TwoArraysEqual {

	public static void main(String[] args) {

		int[] a1 = { 2, 5, 7, 9, 11 };
		//int[] a2 = { 2, 5, 7, 8, 11 };
		  int[] a2 =  {2, 5, 7, 9, 11};

		boolean equalOrNot = true;

		if (a1.length == a2.length) {

         for (int i=0;i<a1.length;i++)
         {
        	 if (a1[i]!=a2[i])
        	 {
        		 equalOrNot=false;
        	 }
         }
			

	     }
		else 
		{
			equalOrNot=false;
		}
		if (equalOrNot)
		{
			System.out.println("Two arrays are Equal");
		}
		else 
		{
			System.out.println("Two arrays are not Equal");
		}

}

}