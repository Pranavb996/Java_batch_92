package com.ptpl.switchcase;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner sc=new Scanner (System.in);
		double num1,num2, total;
		System.out.println("Enter first number : ");
		num1=sc.nextDouble();
		System.out.println("Enter second number : ");
		num2=sc.nextDouble();
		
		System.out.println("Choose operation by pressing number \n1.Addition(+)\n2.Substraction(-)\n3.Multiplication(*)\n4.Division");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			total=num1+num2;
			System.out.println("Addition : "+total);
			break;
		case 2:
			total=num1-num2;
			System.out.println("Substraction : "+total);
			break;
		case 3:
			total=num1*num2;
			System.out.println("Multiplication : "+total);
			break;
		case 4:
			total=num1/num2;
			System.out.println("Division : "+total);
			break;
		default:
			System.out.println("You entered wrong input!");
			
		sc.close();
		}
	}

}
