package com.ptpl.forloops;

public class HeartShape {

	public static void main(String[] args) {

	   int size = 7;

	   for (int i = 0; i < size; i++) {
		    for (int j = 0; j < size - i; j++) {
		             System.out.print(" ");
		         }
		         for (int j = 0; j < 2 * i + 1; j++) {
		         System.out.print("*");
		         }
		          System.out.println();
		        }
		        for (int i = size / 2; i < size; i++) {
		            for (int j = 0; j < i; j++) {
		                
		           	System.out.print(" ");
		            }
		            for (int j = 0; j < 2 * (size - i) - 1; j++) {
		                System.out.print("*");
		            }
		            System.out.println();
		        }
		    }
		

}


