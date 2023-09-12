package com.ptpl.selection;

import java.util.Scanner;

public class DetermineTriangle {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		double a,b,c;
		System.out.println("Enter sides of triagle in sequence a,b &c: ");
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		
		if(a==b && b==c)
			System.out.println("It is Equillateral Triangle");
		else if((a==b && a!=c) || (b==c && b!=a) || (a==c && a!=b))
			System.out.println("It is Isosceles Triangle");
		else
			System.out.println("It is Scalene Triangle");
	}

}
