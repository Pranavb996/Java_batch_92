package com.ptpl;

import java.util.Scanner;

public class AreaOfRTrapezium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double breadth, height , area ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter bredth and height :");
		breadth = sc.nextDouble();
		height = sc.nextDouble();
		
		
		
		//area = 0.5 *breadth* height;
		area = 1.0/2 *breadth* height;
		
		System.out.println("Area of Rectangle : "+ area);
		sc.close();
	}

}
