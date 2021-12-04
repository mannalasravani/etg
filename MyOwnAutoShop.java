package com.sonata;

public class MyOwnAutoShop {
	public static void main(String args[]) {
		Sedan sedan=new Sedan(80,250000,"red",50);
	    Ford ford=new Ford(90,300000,"blue",2009,10);
	    Car car=new Car(100,450000,"white");
		System.out.println("Sedan"+sedan.getSalePrice());
		System.out.println("Ford"+ford.getSalePrice());
		System.out.println("Car"+car.getSalePrice());
		}
	}


