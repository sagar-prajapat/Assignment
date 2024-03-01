package com.sagar;

import java.util.Scanner;

public class Area_circle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("enter radius:");
		 int radius = sc.nextInt();
		 
		 double area = Math.PI*radius*radius;
		 System.out.println("area of circle is:"+area);

	}

}
