package com.practise_01_arrays;

public class _10_Max_Min_Array {

	public static void main(String[] args) {
		
		int [] a = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49,2,200};
		int max =a[0], min =a[0];

          for (int i=0;i<a.length;i++)
			
		{
			
			if (a[i]>max)
			{
				max=a[i];
			}
			else if (a[i]<min)
			{
				min =a[i];
			}
			
		}
		
		
		
		System.out.println(" Max number is  : "+ max);
		System.out.println(" Min number is  : "+ min);


	}

}
