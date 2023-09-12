package com.ptpl.bankingpdf;

import java.util.Scanner;

public class HealthInsurance {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int age;
		String health;
		
		System.out.println("Enter your age : ");
		age = sc.nextInt();
		
		
		if(age>=18 && age<=60) {
			System.out.println("Enter how is you health excellent/poor : ");
			health=sc.next();
			if(health.equalsIgnoreCase("excellent"))
				System.out.println("You are eligible for Insurance.");
			else
				System.out.println("You are not eligible for Insurance , bcoz your health is "+ health);
		}
		else
			System.out.println("Opps! You are not eligible !");
		sc.close();
	}

}
