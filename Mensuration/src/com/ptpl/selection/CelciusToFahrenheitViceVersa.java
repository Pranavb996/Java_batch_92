package com.ptpl.selection;

import java.util.Scanner;

public class CelciusToFahrenheitViceVersa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double c, f, cel = 0, fah = 0;
		int choice;
		System.out.println("choose by Entering number \n 1. celcius to fahernheit \n 2. fahrenheit to celcius");
		choice = sc.nextInt();
		
		
		if (choice == 1) {
			System.out.println("Enter Celcius : ");
			c = sc.nextDouble();
			fah = (c * 9 / 5) + 32;
			System.out.println("Fahrenheit : " + fah);

		} 
		else if (choice == 2) {
			System.out.println("Enter Fahrenheit : ");
			f = sc.nextDouble();
			cel = (f - 32) * 5 / 9;
			System.out.println("Celcius : " + cel);
		} 
		else
			System.out.println("Invalid choice!");

	}

}
