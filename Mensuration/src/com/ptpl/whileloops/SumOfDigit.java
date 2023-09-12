package com.ptpl.whileloops;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num=sc.nextInt();
		int sum=0;
		int remainder=0;
		while(num>=1)
		{
			remainder=num%10;
			sum=sum+remainder;
			num=num/10;
		}
		System.out.println("Sum Of Digits : " +sum);
sc.close();
	}

}
