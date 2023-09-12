package com.ptpl.whileloops;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num=sc.nextInt();
		//int t1=num; // we will divide separate to this number to get only last number
		int remainder;
		int reverse=0;
		while(num>=1)
		{
			remainder=num%10;
			
			reverse=reverse*10+remainder;
			num=num/10;
		}
		System.out.println("reversed number : " +reverse);
sc.close();
	}

}
