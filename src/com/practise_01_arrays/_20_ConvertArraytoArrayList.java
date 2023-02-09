package com.practise_01_arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class _20_ConvertArraytoArrayList {
	
	public static void main (String args []) {
	  String[]  my_array = new String[] {"Python", "JAVA", "PHP",  "Perl", "C#", "C++"};
	  ArrayList<String>  list1 = new ArrayList<String>(Arrays.asList(my_array));
	  System.out.println(list1);
	  ArrayList<String> list=new ArrayList<>();
	  for (int i=0;i<my_array.length;i++)
	  {
		   list.add(my_array[i]);
		   
	  }
	  System.out.println(list);
	  
	}

}
