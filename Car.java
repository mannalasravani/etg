package com.sonata;

public class Car {
    private int speed;
	private double Price;
	private String color;
	public Car(int s,double p,String c) {
		this.speed=s;
		this.Price=p;
		this.color=c;
		}
	public double getSalePrice() {
		return Price;
	}
}


