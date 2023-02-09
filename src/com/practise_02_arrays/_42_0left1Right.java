package com.practise_02_arrays;

import java.util.Arrays;

public class _42_0left1Right {

	public static void main(String[] args) {
        int arr [] = {0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1};
        
        int temp=0;
		 for (int i=0;i<arr.length;i++)
		 {
			for (int j=0;j<arr.length;j++)
			{
				if (arr[j]==1)
				{
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		 }
		 System.out.println(Arrays.toString(arr));

		
	}

}
