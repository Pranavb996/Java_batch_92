package com.ptpl.dowhileloops;

import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=0;
		double tot;
		String exit,pass="exit";
		
		do {
			System.out.println("Enter number 1 & number 2 : ");
			double num1=sc.nextDouble(), num2=sc.nextDouble();
			tot=num1+num2;
			tot=num1-num2;
			tot=num1*num2;
			tot=num1/num2;
			
			System.out.println("Addition = "+tot);
			System.out.println("Substraction = "+tot);
			System.out.println("Multiplication = "+tot);
			System.out.println("Division = "+tot);
			System.out.println("For exit press exit ");
			exit=sc.next().toLowerCase();
			
			if(exit==pass) {
				k++;
				System.out.println(k);
			}
			else
				k=0;
			
		}while(k<=0);
		System.out.println();
		sc.close();
		
		

	}

}
