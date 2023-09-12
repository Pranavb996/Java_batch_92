package com.ptpl.dowhileloops;

import java.util.Scanner;
import java.util.Random;

public class GuessingNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random rd=new Random();
		int ans= rd.nextInt(100);
			int chance=0;
			
		do {
			System.out.println("Guess a number in 10 attempts : ");
			int num1=sc.nextInt();
			
			if(num1==ans)
			{
				System.out.println("You won");
			}
			else if(num1>ans) {
				System.out.println("You entered greater number");
			}
			else 
				System.out.println("You entered lower number");
			chance++;
		}while(chance<=10);
		sc.close();
	}

}
