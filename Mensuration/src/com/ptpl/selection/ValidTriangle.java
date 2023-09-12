package com.ptpl.selection;

import java.util.Scanner;

public class ValidTriangle {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		double a,b,c;
		System.out.println("Enter sides of Triangle a,b & c : ");
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		
		
		if(a+b>c || a+c>b || b+c>a)
			System.out.println("It is valid Triangle ");
		else
			System.out.println("It is invalid Triangle");
	}

}
