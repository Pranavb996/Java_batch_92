package com.ptpl.selection;

import java.util.Scanner;

public class CheckCertainServicesByAge {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		int age;
		System.out.println("Enter your age : ");
		age=sc.nextInt();
		
		if(age>17)
		{
			System.out.println("You are eligible for Voting");
		if(age>17 && age<=40) {
			System.out.println("You are eligible for driving license");}
		else if(age>=60) {
			System.out.println("You are eligible for retirement benifits");}
		}
		else
			System.out.println("Opps! You are under 18");
	}

}
