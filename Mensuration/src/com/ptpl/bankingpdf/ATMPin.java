package com.ptpl.bankingpdf;

import java.util.Scanner;

public class ATMPin {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int pin;
		System.out.println("Enter your PIN : ");
		pin=sc.nextInt();
		
		if(pin==1234)
			System.out.println("ACCESS GRANTED!");
		else
			System.out.println("ACCESS DENIED!");
		sc.close();
	}

}
