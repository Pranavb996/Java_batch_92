package com.ptpl;

import java.util.Scanner;

public class AreaOfRect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double length, width , area ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter bredth and width :");
		length = sc.nextDouble();
		width = sc.nextDouble();
		
		
		
		area = length * width ;
		
		
		System.out.println("Area of Rectangle : "+ area);
		sc.close();
	}

}
