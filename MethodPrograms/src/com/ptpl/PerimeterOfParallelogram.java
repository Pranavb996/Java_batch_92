package com.ptpl;

import java.util.Scanner;

public class PerimeterOfParallelogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double b,h, area ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base and height of Parallelogram :");
		b = sc.nextDouble();		
		h = sc.nextDouble();
		
		
		area = b*h;
		
		
		System.out.println("Area of Parallelogram: "+ area);
		sc.close();
	}

}
