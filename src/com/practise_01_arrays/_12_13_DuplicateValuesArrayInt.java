package com.practise_01_arrays;

public class _12_13_DuplicateValuesArrayInt {

	public static void main(String[] args) {
		
	//	int a [] = {1, 2, 5, 5, 6, 6, 7, 2};
        String[] a = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};

		for (int i=0;i<a.length;i++)
			{
			int count=0;
			
			for (int j=i ;j<a.length;j++)
			{
				 
				if (a[i]==a[j])
				{
					count++;
				}
			}
			
			if (count==2)
			{
				System.out.println(a[i]+ " is a duplicate element");
			}
			
		
	    }

		

	}

}
