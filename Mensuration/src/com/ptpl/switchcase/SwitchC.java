package com.ptpl.switchcase;

import java.util.Scanner;

public class SwitchC {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your choice by pressing number : \n1.print\n2.save\n3.exit");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("Print");
			break;
		case 2:
			System.out.println("Save");
			break;
		case 3:
			System.out.println("Exit");
			break;
			
		default:
			System.out.println("Wrong input!");
		sc.close();
		}
	}

}
