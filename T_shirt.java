package com.sonata;

public class T_shirt {
	String color;
	String material;
	String design;
	String Size;
	
	public T_shirt(String col,String mat,String ds,String Si) {
		this.color=col;
		this.material=mat;
		this.design=ds;
		this.Size=Si;
	}
	public void small() {
		System.out.println("this is small size T_shirt");
	}
	public void large() {
		System.out.println("this is large size T_shirt");
		
	}
	public void medium() {
		System.out.println("this is medium size T_shirt");
	}
	public void display() {
		System.out.println("Color:"+color);
		System.out.println();
		System.out.println("material:"+material);
		System.out.println();
		System.out.println("design:"+design);
		System.out.println();
		System.out.println("Size:"+Size);
		System.out.println();
	}
	public static void main(String args[]) {
		T_shirt t1=new T_shirt("merunred","cotton","fullsleaves","S");
		System.out.println();
		t1.display();
		t1.small();
		T_shirt t2=new T_shirt("blue","cotton","sleaveless","m");
		System.out.println();
		t2.display();
		t2.medium();
		T_shirt t3=new T_shirt("white","cotton","fullsleaves","x");
		System.out.println();
		t3.display();
		t3.large();
		
	}
	

}
