package com.sagar;

public class Data {
	
	static void welcome() {
		System.out.println("HELLO");
	}
	
	public void check() {
		System.out.println("SAGAR");
	}

	public static void main(String[] args) {
		welcome();       //welcome() is static that's why we don't have to create object for it
   
		Data obj = new Data();
		obj.check();
	}

}
