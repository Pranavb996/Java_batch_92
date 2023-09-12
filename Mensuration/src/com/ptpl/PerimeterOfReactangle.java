package com.ptpl;

import java.util.Scanner;

public class PerimeterOfReactangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double s, peri ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side of square :");
		s = sc.nextDouble();
				
		
		
		peri = 4*s;
		
		
		System.out.println("Perimeter of Square : "+ peri);
		sc.close();
	}

}
