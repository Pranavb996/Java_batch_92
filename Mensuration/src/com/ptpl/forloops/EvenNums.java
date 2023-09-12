package com.ptpl.forloops;

import java.util.Scanner;

public class EvenNums {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number : ");
		int i=sc.nextInt();
		
//		for(i=sc.nextInt(); i>=j; i++)
		
			for(int j=1; j<=10;j++ ) {
			System.out.println(i+" * "+j+" = "+(i*j));
			
			
			}
sc.close();
	}

}
