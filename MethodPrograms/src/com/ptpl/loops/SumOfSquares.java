package com.ptpl.loops;

import java.util.Scanner;

public class SumOfSquares {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int i=1;
		int j=i;
		int sqr;
		int sum=0;
		for(i=i; i<=5; i++) {
			sqr=i*i;
			sum=sqr+sum;
		}
		System.out.println("sum : "+sum);

	}

}
