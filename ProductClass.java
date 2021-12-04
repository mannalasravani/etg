package com.sonata;

public class ProductClass {
	
		int proId;
		String proName;
	   static double proPrice;
	    ProductClass(int id,String name,double price){
	    	this.proId=id;
	    	this.proName=name;
	    	this.proPrice=price;
	    }
	    public double Totalbill(double GST) {
	    	double total=this.proPrice*GST;
	    	return total;
	    }
	    public void display() {
	    	System.out.println(proId);
	    	System.out.println(proName);
	    	System.out.println(proPrice);
	    }
	    public static void main(String args[]) {
	    	ProductClass p1=new ProductClass(15,"desktop",40000);
	    	p1.display();
	    	double b=p1.Totalbill(0.08);
	    	System.out.println("TAX:"+b);
	    	double c=b+proPrice;
	    	System.out.println("Total bill with tax:"+c);
	    }
}
	    
	    

	


