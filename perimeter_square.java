package com.sagar;

import java.util.Scanner;

public class perimeter_square {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter side of square:");
		int side = sc.nextInt();
		
		int perimeter = 4*side;
		System.out.println("perimeter of square:"+perimeter);
		

	}

}
