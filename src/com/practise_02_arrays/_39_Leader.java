package com.practise_02_arrays;

public class _39_Leader {

	/*
	 * Note: An element is leader if it is greater
	 *  than all the elements to its
	 * right side.
	 */


	public static void main(String[] args) {
	      
		int arr[] = {10, 9, 14, 23, 15, 0, 9};

	      int leader=arr[0];
	      for (int i=0;i<arr.length;i++)
	      {  
	    	  for (int j=i+1;j<arr.length;j++)
	    	  {
	    		   if (arr[i]<=arr[j])
	    		   {
	    			   break;
	    		   }
	    		   else if (arr[j]<arr[i])
	    		   {
	    			   leader=arr[i]; 
	    			   System.out.println(leader+ " ");
	    		   }
	      }
	    	 
	    	  
	}
	}
}

