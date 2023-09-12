

package com.ptpl;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		
		double r, pi=3.14, area , circumference;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Radius : ");
		r = sc.nextDouble();
		
		
		area = pi*r*r;
		
		circumference = 2 * pi *r;
				
		System.out.println("Area : "+ area);
		System.out.println("Circumferece: "+ circumference);
		
		sc.close();
		
		
		
	}

}
