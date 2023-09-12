package com.ptpl.forloops;

public class CountVowels {

	public static void main(String[] args) {

		String name = "Pranav";
		int len=name.length();
		int count=0;
		for(int nm=0; nm<=len-1; nm++) {
			char i=name.charAt(nm);
			if(i=='a' || i=='A' || i=='e' || i=='E' || i=='i' || i=='I' || i=='o' || i=='O' || i=='u' || i=='U')
			{
				count++;
			}
		}
		
		
		
		System.out.println(count);

	}

}
