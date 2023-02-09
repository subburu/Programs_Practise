package com.practise_01_arrays;

public class _28_DiffMaxMin {

	public static void main(String[] args) {

		int[] arr = { 5, 7, 2, 4, 9 };
		int max = arr[0], min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(max + " max number");
		System.out.println(min + " min number");
		System.out.println("Difference between max  is " + (max - min));

	}

}
