package com.practise_01_arrays;

public class _24_MissingNumber {

	public static void main(String[] args) {
		
		   int[] numbers = new int[]{1,2,3,4,6,7};

		    int sum=0;
		   for (int i=0;i<numbers.length;i++)
		   {
			   sum=sum+numbers[i];
		   }
		   
		   int num=numbers.length;
		 int actualsum=(num*num+1)/2;
		 System.out.println(sum-actualsum+ " is a missing number");
		
		 
		 System.out.println("Method 2");
		 
		 int a[] = { 1, 2, 3,4, 5,7 };
			int sum1 = 0;
			int sum2 = 0;
			for (int i = 0; i < a.length; i++) {
				sum1 = sum1 + a[i];
			}

			for (int j = 1; j <= 7; j++) {
				sum2 = sum2 + j;

			}
		

			System.out.println("Missing number is " + (sum2 - sum1));

	}

}
