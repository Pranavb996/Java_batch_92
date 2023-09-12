package com.ptpl;

import java.util.Scanner;

public class Remainder2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2, rem;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any two number");

		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		rem = n1%n2;

		System.out.println("Remainder = " + rem);

		sc.close();
	}

}
