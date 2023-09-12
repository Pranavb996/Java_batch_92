package com.ptpl.forloops;

public class SquareRoots {

	public static void main(String[] args) {

		for(int i=1; i<=5; i++)
		{
			for(int j=5; j>=1; j--)
			{
				if(i/j==j)
					System.out.println(i);
			}
		}

	}

}
