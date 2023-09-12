package com.ptpl.selection;

import java.util.Scanner;

public class TernaryOperatorMin {
	
	public static void main(String [] args)
	{
		int a,b,min;
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter values of a & b :");
		 a= sc.nextInt();
		 b= sc.nextInt();
		min = a<b ? a:b;
		
		System.out.println("Minimum : "+min);
		
				
		
		
	}

}
