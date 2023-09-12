package com.ptpl.bankingpdf;

import java.util.Scanner;

public class SiCalculator {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner (System.in);
		double amount,rate,total;
		double time;
		System.out.println("Enter amount : ");
		amount=sc.nextDouble();
		System.out.println("Enter rate of interest : ");
		rate=sc.nextDouble();
		System.out.println("Enter time in years : ");
		time=sc.nextDouble();
		
		total=(amount*rate*time)/100;
		
		System.out.println("Simple Interest is : "+total);
		System.out.println("Total Amount is : "+(amount+total));
		sc.close();
		
		
		
	}

}
