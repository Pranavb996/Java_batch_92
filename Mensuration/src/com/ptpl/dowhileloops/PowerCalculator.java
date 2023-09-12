package com.ptpl.dowhileloops;

import java.util.Scanner;

public class PowerCalculator {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num=sc.nextInt();
		System.out.println("Enter power : ");
		int power=sc.nextInt();
		int mul=1;
		while(power>=1) {
			mul=mul*num;
			
			power--;
		}
		System.out.println(mul);
		sc.close();

	}

}
