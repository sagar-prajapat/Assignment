package com.sagar;

import java.util.Scanner;

public class NestedSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your choice:");
		int choice = sc.nextInt();
		System.out.println("enter department:");
		String Stream = sc.next();
		
		switch(choice) {
		 
		case 1->System.out.println("sagar");
		case 2->System.out.println("prashant");
		case 3->{
		       System.out.println("emp number 3:");
		        
		       switch(Stream) {
		       case "IT"->System.out.println("IT dept");
		       case "MBA"->System.out.println("MBA dept");
		       default->System.out.println("lagr raho india");
		       }
		}
		
		
		default->System.out.println("Enter correct choice:");
		}

	    }

}
