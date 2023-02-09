package com.practise_01_arrays;

import java.util.Arrays;

public class _11_ReverseIntegerValue {

	public static void main(String[] args) {
		
		int a [] = {5,2,7,9,6};
		int k= a.length-1;
		System.out.println(Arrays.toString(a)+" Before reversing");
		for (int i=0;i<a.length/2;i++)
		{
			int temp = a [i];
			a [i]=a[k] ;
			a[k]=temp;
			k--;
		}
		System.out.println(Arrays.toString(a)+" After reversing");

	}

}
