package com.sagar;

import java.util.Scanner;

public class Switch_case {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter choice:");
		int choice = sc.nextInt();
		System.out.println("enter stream:");
		String stream = sc.next();
		
		switch(choice) {
		
		case 1:System.out.println("Sagar prajapat");
		       break;
		       
		case 2:System.out.println("krishna");
	           break;
	       
		case 3:System.out.println("prashant");
	           break;
	       
		case 4:System.out.println("employee 4:");
		       switch(stream) {
		       case "CSE":System.out.println("CSE department");
		                  break;
		              
		       case "IT":System.out.println("IT department");
	                      break;
	              
		       case "MBA":System.out.println("MBA department");
	                      break; 
	                      
		       case "EC":System.out.println("EC department");
	                      break;           
	                      
	           default:System.out.println("invalid stream");
	                   break;
		       }
	           break;
	           
		default:System.out.println("invalid choice");
                break;
		}
		

	}

}
