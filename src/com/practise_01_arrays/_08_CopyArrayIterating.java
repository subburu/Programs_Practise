package com.practise_01_arrays;

import java.util.Arrays;

public class _08_CopyArrayIterating {

	public static void main(String[] args) {
		
		int [] arr = {25,14,56,15,36};
		int [] copy =new int [arr.length];
		System.out.println(Arrays.toString(arr) +" Given Array");

		for (int i=0;i<arr.length;i++)
		{
			copy[i]=arr[i];
		}
		System.out.println(Arrays.toString(copy) +" copied Array");

	}

}
