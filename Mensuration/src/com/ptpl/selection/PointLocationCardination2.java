package com.ptpl.selection;

import java.util.Scanner;

public class PointLocationCardination2 {

	public static void main(String[] args) {
		
		int x,y;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the co-ordinates of point");
		x= sc.nextInt();
		y=sc.nextInt();
		
		if(x>0)
			if(y>0)
				System.out.println("Point lies on the first quadrant");
		if(x<0)
			if(y>0)
				System.out.println("Point lies on the second quadrant");
		if(x<0)
			if(y<0)
				System.out.println("Point lies on the third quadrant");
		if(x>0)
			if(y<0)
				System.out.println("Point lies on the fourth quadrant");
		
	}

}
