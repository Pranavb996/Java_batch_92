package com.ptpl.selection;

import java.util.Scanner;

public class PointLocationCardination {

	public static void main(String[] args) {
		
		int x,y;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the co-ordinates of point");
		x= sc.nextInt();
		y=sc.nextInt();
		
		
		if (x>0 && y>0)
				System.out.println("Point lies in I Quadrant");
		
		else if (x<0 && y>0)
				System.out.println("Point lie in II Quadrant");
		
		else if (x<0 && y<0)
				System.out.println("Point lie in III Quadrant");
		
		else if (x>0&& y<0)
				System.out.println("Point lie in IV Quadrant");
		
		else if (x!=0&&y==0)
				System.out.println("Point lie on x-axis");
		
		else if (x==0&&y!=0)
				System.out.println("Point lie on y-axis");
		else 
			System.out.println("point lies on constant");
	}

}
