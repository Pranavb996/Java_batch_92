package com.ptpl.bankingpdf;

import java.util.Scanner;

public class PremiumCalculator {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Persons age: ");
		int age= sc.nextInt();
		
		System.out.println("Enter person's location(city/village) :");
		String location=sc.next();
		
		System.out.println("Enter person's health(excellent/poor) : ");
		String health=sc.next();
		
		System.out.println("Enter Gender (male/female) : ");
		String gender=sc.next();
		
		int premium=0;
		int policyAmount=0;
		
		if(age>=25 && age<=35 && location.equals("city") && gender.equals("male") && health.equals("excellent"))
		{
			
			premium=4;
			policyAmount= 200000;
			
		}
		else if(age>=25 && age<=35 && location.equals("city") && gender.equals("female") && health.equals("excellent"))
		{
			premium=3;
			policyAmount = 100000;
			
		}
		else if(age>=25 && age<=35 && location.equals("village") && gender.equals("male") && health.equals("poor"))
		{
			premium=6;
			policyAmount = 10000;
			
		}
		
		else
		{
			System.out.println("Entered condition do not match the premium criteria");
		}
	
		int totalpremium=(premium*policyAmount)/1000;
		System.out.println("Premium Amount : " + totalpremium);
		sc.close();
	}

}
