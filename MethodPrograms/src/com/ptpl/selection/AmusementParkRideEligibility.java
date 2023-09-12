package com.ptpl.selection;

import java.util.Scanner;

public class AmusementParkRideEligibility {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int age , height;
		System.out.println("Enter your age : ");
		age=sc.nextInt();
		System.out.println("Enter your height in cm : ");
		height=sc.nextInt();
		
		if(age>12 && height>150)
			System.out.println("You are Eligible for ride ");
		else
			System.out.println("You are not Eligible for ride");
	}

}
