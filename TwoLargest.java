package com.sonata;

public class TwoLargest {
	public static void main(String args[]) {
		int arr[]= {50,90,40,60,20,30};
		System.out.println("array elements: ");
		for(int a=0;a<arr.length;a++)
		{
			System.out.println(arr[a]+" ");
			
		}
		System.out.println("\n");
		int large1=arr[0];
		int large2=arr[1];
		int ref;
		if(large1 < large2)
		{
			ref=large1;
			large1=large2;
			large2=ref;
			
		}
		for(int i=2;i<arr.length;i++)
		{
			if(arr[i]>large1)
			{
				large2=large1;
				large1=arr[i];
			}
		else if(arr[i] >large2 && arr[i] !=large1)
		{
			large2=arr[i];
		}
		}
		System.out.println("first largest is "+large1);
		System.out.println("second largest is "+large2);
	}
	

}
