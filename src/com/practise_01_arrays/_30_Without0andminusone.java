package com.practise_01_arrays;

public class _30_Without0andminusone {

	public static void main(String[] args) {

	    int[] arr = {50, 77, 12, 54, -11};

	    boolean ZeroMinusOne=true;
	    for (int i=0;i<arr.length;i++)
	    {
	    	if (arr[i]==0 || arr [i]==-1)
	    	{
	    		ZeroMinusOne=false;
	    	}
	    	else
	    	{
	    		ZeroMinusOne=true;
	    	}
	    }

		System.out.println(ZeroMinusOne);
	}

}
