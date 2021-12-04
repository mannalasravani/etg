package com.sonata;

public class Sedan extends Car{
	private int length;
	public Sedan(int s,double p,String c,int l){
		 super(s,p,c);
		 this.length=l;
	 }
	 public double getSalePrice() {
		 if(length>20) {
			 return super.getSalePrice()-(super.getSalePrice()*0.5);
		 }
		 else
		 {
			 return super.getSalePrice()-(super.getSalePrice()*0.1);
		 }
	 }
}


