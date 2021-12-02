package com.sonata;

public class HighestDuplicate {
  public static void main(String args[]) {
	  int count= 0;
	 int arr[]= {8,8,7,7,9,6,6,4};
	 System.out.println("original array elements: ");
	 for(int i=0;i<arr.length;i++)
	 {
		 System.out.println(arr[i]+" ");
	 }
	 System.out.println("\n");
	 System.out.println("duplicates present in the array elements are:");
	 for(int a=0;a<arr.length;a++)
	 {
		    for(int b=a+1;b<arr.length;b++)
		    {
		    	if(arr[a]==arr[b])
		    	{
		    		System.out.println(arr[b]+" ");
		    	}
		    }
	 }
	 System.out.println();
	 System.out.println("highest count of duplicates are "+count);
  }
}
