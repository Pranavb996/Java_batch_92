package com.ptpl.whileloops;

import java.util.Scanner;

public class FactorFind {

	public static void main(String[] args) {



		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number : ");
		int num=sc.nextInt();
		int i=1;
		int fact;
		System.out.println("factors of " +num+ " is :");
		while(i<=num)
		{
			fact=num%i;
			
			if(fact==0)
				System.out.print(i+" ");
			i++;
		}

	}

}
