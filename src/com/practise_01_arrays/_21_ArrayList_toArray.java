package com.practise_01_arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class _21_ArrayList_toArray {

	public static void main(String[] args) {

		  ArrayList<String> list = new ArrayList<String>();

		  list.add("Python");
		 
		  list.add("Java");
		 
		  list.add("PHP");
		  
		  list.add("C#");
		 
		  list.add("C++");
		  
		  list.add("Perl");
		  String[]  my_array = new String[list.size()];
		  list.toArray(my_array);
		  for (int i=0;i<my_array.length;i++)
		  {
			  System.out.println(my_array[i]);
		  }
		
	}

}
