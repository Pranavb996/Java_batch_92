package com.ptpl.whileloops;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num=sc.nextInt();
		int t1=num; // we will divide separate to this number to get only last number
		int remainder;
		int reverse=0;
		while(num>=1)
		{
			remainder=num%2;
			
			reverse=reverse*10+remainder;
			num=num/2;
		}
		int t=t1%2;
		if(t==0)
			System.out.print(reverse+ "0");
		else
			System.out.println("reversed number : " +reverse);
sc.close();
	}

}
