package com.ptpl.forloops;

import java.util.Scanner;

public class PowersOfInput {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num=sc.nextInt();
		int total=1;
		for (int i=1; i<=5; i++)
		{
			total=total*num;
			System.out.println(num+"^"+i+ " = " +total);
		}
		

	}

}
