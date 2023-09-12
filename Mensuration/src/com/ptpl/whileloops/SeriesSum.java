package com.ptpl.whileloops;

import java.util.Scanner;

public class SeriesSum {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number : ");
		double num=sc.nextInt();
		double sum=0;
		
		while(num>=1) {
			sum=sum+(1/num);
			num--;
			
		}
		System.out.println("Series sum is : " +sum);
		sc.close();
	}

}
