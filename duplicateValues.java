package com.sonata;

public class duplicateValues {
  public static void main(String args[]) {
	  int a[]= {1,2,3,4,2,3,5,9};
	  for(int i=0;i<=7;i++) {
		  for(int j=i+1;j<=7;j++) {
			  if(a[i]==a[j])
			  System.out.println(a[j]);
		  }
			  
	  }
  }
}
