package com.sonata;

public class StudentDetails {
	
	
		int stdId;
		String stdName;
		int stdClass;
		StudentDetails(int n,String name,int a){
			this.stdId=n;
			this.stdName=name;
			this.stdClass=a;
		}
		public void display() {
			System.out.println(stdId);
			System.out.println(stdName);
			System.out.println(stdClass);	
		}
		public static void main(String args[]) {
			StudentDetails s=new StudentDetails(01,"srav",9);
			s.display();
			StudentDetails s1=new StudentDetails(19,"yuva",8);
			s1.display();
		}
	}


