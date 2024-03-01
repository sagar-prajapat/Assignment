package com.sagar;

public class overload {

	public static void main(String[] args) {
		int answer = sum(50,50);
		System.out.println(answer);
		display("ram");
	}
	
	static int sum(int x,int y) {
		return x+y;
	}
	static int sum(int x,int y,int z) {
		return x+y+z;
	}
	
	static void display(String data) {
		System.out.println(data);
	}

}
