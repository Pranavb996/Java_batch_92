package com.ptpl.whileloops;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num=sc.nextInt();
		int temp=num-1;
		int tot;
		int count=0;
		if(num!=0) {
		while(temp>=2) {
			tot=num%temp;
			
			if(tot==0)
				count++;
			temp--;
			
		}
		if(count>=1)
			System.out.println("number is not prime");
		else 
			System.out.println("number is prime");
		}
		else
			System.out.println("0 is neither positive nor negative");
		sc.close();
		

	}

}
