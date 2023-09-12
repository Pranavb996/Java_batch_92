package com.ptpl.forloops;

import java.util.Scanner;

public class SumOfN_Numbers {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num=sc.nextInt();
		int temp=num;
		int total=0;
		for ( num=num; num>=1; num--)
		{
			total=total+num;
			
		}
		System.out.println("sum of "+temp+" = " +total);

	}

}
