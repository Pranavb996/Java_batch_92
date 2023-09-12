package com.ptpl.whileloops;

import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int num=1 + (int)(100 * Math.random());
		
		int chance=10;
		
		while(chance>=10)
		{
			int choice=sc.nextInt();
			
			
			if(choice==num)
			{
				System.out.println("You won!");
			}
			
		}
		

	}

}
