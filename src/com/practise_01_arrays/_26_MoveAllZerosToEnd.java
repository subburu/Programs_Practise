package com.practise_01_arrays;

import java.util.Arrays;

public class _26_MoveAllZerosToEnd {

	public static void main(String[] args) {
		
        int[] arr = {0,0,1,0,3,0,5,0,6};
        
        int temp=0;
		 for (int i=0;i<arr.length;i++)
		 {
			for (int j=0;j<arr.length;j++)
			{
				if (arr[j]==0)
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		 }
		 System.out.println(Arrays.toString(arr));
		
	}
		 }


