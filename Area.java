package com.sagar;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter radius of circle:");
		 int radius = sc.nextInt();
		 
		 double area = Math.PI*radius*radius;
		 System.out.println("area of circle is:"+area);
	}

}
