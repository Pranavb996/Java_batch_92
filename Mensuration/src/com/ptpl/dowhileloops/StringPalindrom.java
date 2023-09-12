package com.ptpl.dowhileloops;

import java.util.Scanner;

public class StringPalindrom {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String");

		String input=sc.next().toLowerCase();
		

//		String Collector=input.replaceAll

		int left=0;
		int right=input.length()-1;
		boolean isPalindrome=true;


		do{
			if(input.charAt(left) != input.charAt(right)){
				isPalindrome=false;
				break;
			}
			
			left++;
			right--;
		}
		while(left<right);

			if(isPalindrome){
				System.out.println(""+input+" is a Palindrome");
			}
			else{
				System.out.println(""+input+" is not a Palindrome");
			}

	}

}
