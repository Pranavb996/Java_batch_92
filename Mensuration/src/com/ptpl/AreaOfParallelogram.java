package com.ptpl;

import java.util.Scanner;

public class AreaOfParallelogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double l,b, area ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length and breadth of Parallelogram :");
		l = sc.nextDouble();
		b = sc.nextDouble();		
		
		
		area = 2* (l*b);
		
		
		System.out.println("Perimeter of Parallelogram: "+ area);
		sc.close();
	}

}
