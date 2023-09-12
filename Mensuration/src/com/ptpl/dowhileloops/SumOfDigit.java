package com.ptpl.dowhileloops;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number : ");
		int sum=0, num1=sc.nextInt(),rem;
		
		do {
			rem= num1%10;
			sum=sum+rem;
			num1=num1/10;
		}while(num1>=1);
		System.out.println("Sum Of digit is : "+sum);
sc.close();
	}

}
