package com.ptpl.dowhileloops;

import java.util.Scanner;

public class PasswordChecker {

	public static void main(String[] args) {

		final String p1="pranav";
		String EnterPassword;
		Scanner sc=new Scanner(System.in);
		
		
		do {
			System.out.println("Enter Password : ");
			EnterPassword=sc.next();
			if(EnterPassword .compareToIgnoreCase(p1)) {
				System.out.println("Access Granted");
			}else {
				System.out.println("Access Denied! Please try again !");}
		}while(true);
//		sc.close();
	}

}
