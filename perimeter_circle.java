package com.sagar;

import java.util.Scanner;

public class perimeter_circle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("enter radius:");
		 int radius = sc.nextInt();
		 
		 double perimeter = Math.PI*radius*2;
		 System.out.println("perimeter of circle is:"+perimeter);

	}

}
