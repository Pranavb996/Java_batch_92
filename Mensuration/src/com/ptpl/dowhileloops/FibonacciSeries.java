package com.ptpl.dowhileloops;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		System.out.println("Enter start range number : ");
		int num1=sc.nextInt();
		int num2=num1+1;
		System.out.println("Enter the end of range : ");
		int end=sc.nextInt();
		int fib=0;
		System.out.print(num1+ " "+num2+ " ");
		do
		{
			fib=num1+num2;
			System.out.print(fib+ " ");
			num1=num2;
			num2=fib;
			end--;
		}while(end>=1);
		
sc.close();

	}

}
