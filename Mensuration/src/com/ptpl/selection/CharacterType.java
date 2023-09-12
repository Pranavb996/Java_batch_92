package com.ptpl.selection;

import java.util.Scanner;

public class CharacterType {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Character : ");
		
		char ch=sc.next().charAt(0);
		
		if(Character.isUpperCase(ch))
			
		{
			System.out.println("Character is in Upper Case");
		}
		
		else if(Character.isLowerCase(ch))
		{
		System.out.println("Character is in Lower Case");
		}
		
		else if(Character.isDigit(ch))
		{
			System.out.println("Character is in Digit");
		}
	}

}
