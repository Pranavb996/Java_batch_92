package com.ptpl.selection;

import java.util.Scanner;

public class LargestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter values of a & b : ");
		a= sc.nextInt();
		b= sc.nextInt();
		
		if(a>b)
			System.out.println(a+ " is largest ");
		else
			System.out.println(b+ " is largest ");
	}

}
