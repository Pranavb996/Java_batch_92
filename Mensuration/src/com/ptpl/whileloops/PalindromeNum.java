package com.ptpl.whileloops;

import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num=sc.nextInt();
		int temp=num;
		int remainder;
		int reverse=0;
		while(num>=1)
		{
			remainder=num%10;
			reverse=reverse*10+remainder;
			num=num/10;
		}

		if(temp==reverse)
			System.out.println("It is palindrome number "+reverse);
		else
			System.out.println("It is not palindrome number "+reverse);
sc.close();
	}

}
