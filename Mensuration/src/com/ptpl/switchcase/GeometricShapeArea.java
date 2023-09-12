package com.ptpl.switchcase;

import java.util.Scanner;

public class GeometricShapeArea {

	public static void main(String[] args) {

		Scanner sc=new Scanner (System.in);
		int choice;
		double side,redius,base,hypo,total;
		System.out.println("Enter your choice : \n1.Area of circle \n2.Area of square \n3.Area of Triangle");
		choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("Enter redius: ");
			redius=sc.nextDouble();
			total=2*3.1412*(redius*redius);
			System.out.println("Area of Circle is : "+total);
			break;
			
		case 2:
			System.out.println("Enter side: ");
			side=sc.nextDouble();
			total=side*side;
			System.out.println("Area of Square is : "+total);
			break;
			
		case 3:
			System.out.println("Enter base : ");
			base=sc.nextDouble();
			System.out.println("Enter hypotenus: ");
			hypo=sc.nextDouble();
			total=(1.0/2)*base*hypo;
			System.out.println("Area of Triangle is : "+total);
			break;
			
			default:
				System.out.println("Enter valid Input ! ");
		sc.close();
		}

	}

}
