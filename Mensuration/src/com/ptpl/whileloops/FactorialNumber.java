package com.ptpl.whileloops;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num=sc.nextInt();
		int temp=num;
		int count=1;
		while(num>=1)
		{
			count=num*count;
			num--;
			
			
		}
		System.out.print ("Factorial :  "+count);

	}

}
