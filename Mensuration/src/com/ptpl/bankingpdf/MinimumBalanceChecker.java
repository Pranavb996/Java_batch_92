package com.ptpl.bankingpdf;

import java.util.Scanner;

public class MinimumBalanceChecker {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// I know it's not the secure way to ask you for your personel account balance,
		// but we'll just check your account type
		double bal;
		System.out.println("Enter your Balance : ");
		bal=sc.nextDouble();
		if(bal>=1000)
			System.out.println("Your account is maintained");
		else
			System.out.println("Your account is below the minimum balance criteria,\nplease deposite money in your account and make it maintained");
		sc.close();
	}

}
