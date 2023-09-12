package com.ptpl.selection;

import java.util.Scanner;

public class StagesOfLife {

	public static void main(String[] args) {
		
		int age ;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age : ");
		age=sc.nextInt();
		
		if(age<13)
			System.out.println("Your age is : "+age+" And you are child");
		else if(age>=13 && age<=18)
			System.out.println("Your age is : "+age+" And you are Teeneger");
		else if(age>18 && age<60)
			System.out.println("Your age is : "+age+" And you are Adult");
		else
			System.out.println("Your age is : "+age+" And you are Senior citizen");
	}

}
