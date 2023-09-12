package com.ptpl;

import java.util.Scanner;

public class PerimeterOfCircle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double r, pi= 3.1412, peri ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of circle :");
		r = sc.nextDouble();
				
		
		
		peri = 2*pi*r;
		
		
		System.out.println("Perimeter of Circle : "+ peri);
		sc.close();
	}

}
