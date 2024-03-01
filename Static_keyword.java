package com.sagar;

public class Static_keyword {
	
	static float data = 2.564f;
	static double beta;
	
	static {
		System.out.println("static block is working");
		beta = data * 2.56;
	}
	
	

	public static void main(String[] args) {
		
		System.out.println("welcome to main method");
		System.out.println("value of beta is: "+data);
	}

}
