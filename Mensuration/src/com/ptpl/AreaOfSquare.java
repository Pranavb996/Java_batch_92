package com.ptpl;

import java.util.Scanner;

public class AreaOfSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double s , area ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side of square :");
		s = sc.nextDouble();
		
		area = s*s;
		
		
		System.out.println("Area of square : "+ area);
		sc.close();
	}

}
