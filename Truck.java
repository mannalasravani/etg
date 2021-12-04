package com.sonata;

public class Truck extends Car {
	private int weight;
	public Truck(int s,double rp,String c,int w) {
		super(s,rp,c);
		this.weight=w;
	}
	public double getSalePrice() {
		super.getSalePrice();
		if(weight>2000)
		{
			return this.getSalePrice()-(super.getSalePrice()*0.5);
		}
		else {
			return super.getSalePrice()-(super.getSalePrice()*0.1);
		}
	}
}


