package com.ptpl;

import java.util.Scanner;

public class AreaOfRTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		triangleA();
	}

	public static void triangleA() {
		double base, hypo , area ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base :");
		base = sc.nextDouble();
		
		System.out.println("Enter hypotenuse : ");
		hypo = sc.nextDouble();
		
		
		area = (1.0/2.0) * base * hypo ;
		
		System.out.println("Area of Trapezium: "+ area);
		sc.close();
	}

}
