package com.ptpl.selection;

import java.util.Scanner;

public class PassFail {

	public static void main(String[] args) {
		
		double marks;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter marks : ");
		marks = sc.nextDouble();
		
		if(marks >= 35 )
			
			System.out.println("Pass");
		else
			System.out.println("Fail");

	}

}
