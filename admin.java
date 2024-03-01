package com.sagar;

public class admin {
	
	static int data = welcome();
	
	static {
		System.out.println("static block working!");
	}
	
	static int welcome() {
		System.out.println("this is welcome method");
		return 256;
	}

	public static void main(String[] args) {
		System.out.println("welcome "+data);

	}

}
