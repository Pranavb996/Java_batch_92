package com.ptpl.switchcase;

import java.util.Scanner;

public class SimpleATM {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Select language by pressing number : \n1.English\n2.French\n3.Spanish");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("Hello, Glad to meet you !");
			break;
		case 2:
			System.out.println("Bonjour, ravi de vous rencontrer !");
			break;
		case 3:
			System.out.println("Hola encantado de conocerte !");
			break;
			
		default:
			System.out.println("Wrong input!");
			
		sc.close();
		}
	}

}
