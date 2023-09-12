package com.ptpl.selection;

import java.util.Scanner;

public class MarksAndGrade {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		double m1,m2,m3,m4,m5,total,avg,grade;
		System.out.println("Enter marks in sequence m1,m2,m3,m4&m5");
		m1=sc.nextDouble();
		m2=sc.nextDouble();
		m3=sc.nextDouble();
		m4=sc.nextDouble();
		m5=sc.nextDouble();
		System.out.println("\nM1="+m1+"\nM2="+m2+"\nM3="+m3+"\nM4="+m4+"\nM5="+m5);
		total=m1+m2+m3+m4+m5;
		avg=total/5;
		
		if(m1>=35 && m2>=35 && m3>=35 && m4>=35 && m5>=35)
		{
			if(avg>=90)
				System.out.println("Your Grade is A.");
			else if(avg>=80)
				System.out.println("Your Grade is B");
			else if(avg>=70)
				System.out.println("Your Grade is C.");
			else if(avg>=60)
				System.out.println("Your average percentage is : "+avg+" Your Grade is D.");
			else
				System.out.println("Your percentage is : "+avg+" You are fail");
		}
		else
			System.out.println("You are not qualified minimum subject marks! You are fail.");
	}

}
