package com.ptpl.selection;

import java.util.Scanner;

public class SmallestOfThree2 {
	public static void main(String [] args) {
		
		int a,b,c;
		Scanner sc  = new Scanner (System.in);
		
		System.out.println("Enter values of a,b &c : ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if (a<b) {
			
			if(a<c) {
				System.out.println(a+" is Smallest");
			}
			else
				System.out.println(c+" is Smallest");
			
		}else
		{
			if(b<c)
				System.out.println(b+ " is Smallest");
			else
				System.out.println(c +" is Smallest");
		}
	}

}
