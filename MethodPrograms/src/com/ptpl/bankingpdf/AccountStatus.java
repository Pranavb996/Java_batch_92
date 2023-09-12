package com.ptpl.bankingpdf;

import java.util.Scanner;

public class AccountStatus {

	public static void main(String[] args) {

		Scanner sc=new Scanner (System.in);
		double acBal;
		System.out.println("Enter your balance");
		acBal=sc.nextDouble();
		
		if(acBal>0)
			System.out.println("Account is credit");
		else if(acBal<0)
			System.out.println("Account is in minus");
		else
			System.out.println("Account is zero");
		sc.close();
	}

}
