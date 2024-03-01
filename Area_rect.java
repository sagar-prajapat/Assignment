package com.sagar;

import java.util.Scanner;

public class Area_rect {

	
		public static void main(String[] args) {
			 Scanner sc = new Scanner(System.in);
			 System.out.println("enter length of rectangle:");
			 int length = sc.nextInt();
			 
			 System.out.println("enter breadth of rectangle:");
			 int breadth = sc.nextInt();
			 
			 double area = length*breadth;
			 System.out.println("area of rectang is:"+area);
		}

	}


