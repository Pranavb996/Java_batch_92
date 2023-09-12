

package com.ptpl;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		
		double length, width, area , perimeter ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length : ");
		length = sc.nextDouble();
		
		System.out.println("Enter width : ");
		width = sc.nextDouble();
		
		area = length * width;
		
		perimeter = 2 * (length + width );
				
		System.out.println("Area : "+ area);
		System.out.println("Perimeter: "+ perimeter);
		
		sc.close();
		
		
		
	}

}
