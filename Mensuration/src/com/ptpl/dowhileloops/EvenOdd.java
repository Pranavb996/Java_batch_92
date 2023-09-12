package com.ptpl.dowhileloops;

public class EvenOdd {

	public static void main(String[] args) {

		int range1=1;
		int range2=50;
		
		do {
			
		if(range1%2==0)
			System.out.println(" even: "+range1);

		else 
			System.out.println
			(" odd: "+range1);
		range1++;
		}while(range1<=range2);
	}

}
