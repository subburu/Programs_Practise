package com.practise_01_arrays;

public class _02_SumArray {

	public static void main(String[] args) {

		int a[] = {3,4,5,7,9};
		int sum =0;
		
		for (int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("sum of an array is : "+ sum );
	}

}
