package com.practise_01_arrays;

public class _17_SecondLargest {

	public static void main(String[] args) {
		int a[]={44,66,99,77,33,22,55,99};
	   
        int max =a[0];
        for (int i=0;i<a.length;i++)
        {
        	if (a[i]>max)
        	{
        		max =a[i];
        		
        	}
        }
		System.out.println(max+ " Highest number");
		 
		int secondMax=a[0];
		
		for (int i=0;i<a.length;i++)
		{
			if (a[i]>secondMax && a[i]<max)
			{
				secondMax=a[i];
			}

		}
		System.out.println(secondMax+ " SecondHighest number");

		
		

}
}