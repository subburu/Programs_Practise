package com.practise_01_arrays;

public class _14_15_CommonElements {

	public static void main(String[] args) {
		/*
		 * String[] a = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
		 * 
		 * String[] a1 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2",
		 * "JAVA"};
		 */
	     int[] a = {1, 2, 5, 5, 8, 9, 7, 10};
	      int[] a1 = {1, 0, 6, 15, 6, 4, 7, 0};

	     for (int i=0;i<a.length;i++)
	     {
	    	 for (int j=0;j<a1.length;j++)
	    	 {
	    		 if (a[i]==a1[j])
	    		 {
	    			 
	    			 System.out.println(a[i]+" common element");
	    		 }
	    	 }
	     }
	     
	}

}
