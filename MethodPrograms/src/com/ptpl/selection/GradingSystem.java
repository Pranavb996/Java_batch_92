package com.ptpl.selection;

import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {
		
		double marks;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter marks : ");
		marks = sc.nextDouble();
		
		if( marks <=100) {
			
			if(marks>=90)
				System.out.println("Your Grade is A.");
			else if(marks>=80)
				System.out.println("Your Grade is B");
			else if(marks>=70)
				System.out.println("Your Grade is C.");
			else if(marks>=60)
				System.out.println("Your Grade is D.");
			else
				System.out.println("You are Fail.");
		}
		else
			System.out.println("Invalid!");
			
			
		

	}

}
