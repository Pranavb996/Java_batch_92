package com.ptpl.bankingpdf;

import java.util.Scanner;

public class AgeEligibilityForInsurance {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int age;
		System.out.println("Enter your age : ");
		age=sc.nextInt();
		
		if(age>=18 && age<=60)
			System.out.println("You are eligible for Insurance.");
		else
			System.out.println("You are not eligible for Insurance.");
		sc.close();
	}

}
