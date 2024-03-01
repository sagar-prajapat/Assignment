package com.sagar;

import java.util.Scanner;

public class Perimeter_rect {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("enter length of rectangle:");
		 int length = sc.nextInt();
		 
		 System.out.println("enter breadth of rectangle:");
		 int breadth = sc.nextInt();
		 
		 double perimeter = 2*(length+breadth);
		 System.out.println("perimeter of rectangle is:"+perimeter);

	}

}
