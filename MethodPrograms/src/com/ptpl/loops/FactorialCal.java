package com.ptpl.loops;

import java.util.Scanner;

public class FactorialCal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number : ");
		int i=sc.nextInt();
		int fact=1;
		for(i=i;i>=1; i--)
		{
			fact=i*fact;
		}
		System.out.println("factorial : "+fact);

	}}


