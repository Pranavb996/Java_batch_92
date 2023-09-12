package com.ptpl.dowhileloops;

import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String : ");
		String a=sc.next();
		int i;
		i=a.length();
		int i1=0;
		i=i-1;
		int k=0;
		
		do {
			 
			 
			char c=a.charAt(i);
			char c1=a.charAt(i1);
			if(c==c1)
				k++;
			i--;
			i1++;
			
			//System.out.print(c);
			
			
		}while(i==i1);
		if(k==(a.length()/2)) {
			System.out.println("palindrom");}
		else
			System.out.println("notpalindrom");
		sc.close();
	}

}
