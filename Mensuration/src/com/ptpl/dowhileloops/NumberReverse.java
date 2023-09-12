package com.ptpl.dowhileloops;

import java.util.Scanner;

public class NumberReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num=sc.nextInt();
		//int t1=num; // we will divide separate to this number to get only last number
		int remainder;
		int reverse=0;
		do
		{
			remainder=num%10;
			num=num/10;
			reverse=reverse*10+remainder;
			
		}while(num>=1);
		System.out.println("reversed number : " +reverse);
sc.close();

	}

}
