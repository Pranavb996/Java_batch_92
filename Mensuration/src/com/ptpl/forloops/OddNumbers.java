package com.ptpl.forloops;

import java.util.Scanner;

public class OddNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number : ");
		int i=sc.nextInt();
		i=i+1;
	System.out.println("Print odd numbers between 30 to 50 : ");
		for(i=i; i<=50; i=i+2) {
			System.out.println(i);
		}
		
			
sc.close();
	}

}
