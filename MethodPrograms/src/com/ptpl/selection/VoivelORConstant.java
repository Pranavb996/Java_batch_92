package com.ptpl.selection;

import java.util.Scanner;

public class VoivelORConstant {

	public static void main(String[] args) {
		
		char ch;
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter any character : ");
		ch=sc.next().charAt(0);
		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			System.out.println(ch+ " is vovel");
		}
		else
			System.out.println(ch+" is constant");
			

	}

}
