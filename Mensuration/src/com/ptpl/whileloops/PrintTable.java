package com.ptpl.whileloops;

import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num=sc.nextInt();
		int i=1;
		while(i<=10)
		{
			System.out.println(num+" * "+i+ "  = "+(num*i));
			i++;
		}
		sc.close();

	}

}
