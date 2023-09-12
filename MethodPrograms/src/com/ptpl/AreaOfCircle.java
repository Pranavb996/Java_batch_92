package com.ptpl;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		circleA(5);
	}

	public static void circleA(double r) {
		double pi= 3.1412, area ;
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter radius of circle :");
		//
				
		
		
		area = pi * r*r;
		
		
		System.out.println("Area of Circle : "+ area);
		sc.close();
	}

}
