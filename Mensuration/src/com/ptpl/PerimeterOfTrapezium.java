package com.ptpl;

import java.util.Scanner;

public class PerimeterOfTrapezium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a,b,c,d ,peri ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sides of a,b,c and d of Trapezium in sequence :");
		a = sc.nextDouble();
		b = sc.nextDouble();		
		c = sc.nextDouble();
		d = sc.nextDouble();
		
		peri = a+b+c+d;
		
		
		System.out.println("Perimeter of Rectangle: "+ peri);
		sc.close();
	}

}
