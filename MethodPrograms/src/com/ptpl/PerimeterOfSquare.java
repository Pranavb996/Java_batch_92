package com.ptpl;

import java.util.Scanner;

public class PerimeterOfSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double l,b, peri ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length and breadth of Rectangle :");
		l = sc.nextDouble();
		b = sc.nextDouble();		
		
		
		peri= 2* (l*b);
		
		
		System.out.println("Perimeter of Rectangle: "+ peri);
		sc.close();
	}

}
