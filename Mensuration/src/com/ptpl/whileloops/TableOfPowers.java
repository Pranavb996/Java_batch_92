package com.ptpl.whileloops;

import java.util.Scanner;

public class TableOfPowers {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num=sc.nextInt();
		System.out.println("Enter end of range : ");
		int end = sc.nextInt();
		
		int total=1;
		int i=1;
		
		while( i<=end)
		{
			total=total*num;
			System.out.println(num+"^"+i+ " = " +total);
			 i++;
		}
		sc.close();

	}

}
