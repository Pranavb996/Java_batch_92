package student;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Marks ms = new Marks();
	
		
		
		while (true)
		{
			
			System.out.println("Enter choice : ");
			int choice=sc.nextInt();
		switch (choice) {
		case 1:
			for(int i=1; i<=ms.roll_arr.length-1; i++)
			{
				Marks s = new Marks();
				System.out.println("Enter your name : ");
				s.setName(sc.next());
			s.addStudent(s);
			s[s.i]=s.rollno;
			s.name_arr[i]=s.getName();
			
			System.out.println("Press >> no << to exit else press any key and enter");
			String exit = sc.next().toLowerCase();
			if (exit.equals("no")) {
				break;
				}
			}
		case 2:
			Marks s = new Marks();
			for(int i=0; i<=s.roll_arr.length-1; i++) {
			s.displayStudent(s);
			}
			break;
			
		
			
		default :
			break;
			
//			
//			System.out.println("Enter rollno to search : ");
//			int search=sc.nextInt();
			
			
			
		}
		}
		
//		int[] rollno_arr=new int[100];
//		String[] name_arr=new String[100];
		
//		String exit = sc.next().toLowerCase();
//		
//		
//		for(int r_i=0; r_i<=rollno_arr.length-1; r_i++) {
//			
//			rollno_arr[r_i]=s.getRollno();
//			break;
//
//		}
//		
//		for (s.i = 0; s.i < s.rollno.length; s.i++)
//
//		{
//			System.out.println("Enter roll no : ");
//			s.rollno[s.i] = sc.nextInt();
//			System.out.println("Enter Name : ");
//			s.name = sc.next();
//			System.out.println("Enter date of birth (ddmmyyyy) : ");
//			s.dob = sc.nextInt();
//			System.out.println("Enter Gender : ");
//			s.gender = sc.next();
//			System.out.println("Enter mobile number : ");
//			s.mobile_no = sc.nextLong();
//			System.out.println("Enter 5 subject marks : ");
//			s.s1=sc.nextInt();
//			s.s2=sc.nextInt();
//			s.s3=sc.nextInt();
//			s.s4=sc.nextInt();
//			s.s5=sc.nextInt();
//			s.percentage();
//			System.out.println(
//					"Roll no : " + s.rollno[s.i] + "\tName: " + s.name + "\tDOB: " + s.dob + "\tGender: " + s.gender
//							+ "\tMobile No: " + s.mobile_no + "\n\t Marks %: " + s.percent + "\tCollege name: " + s.clg);
//			System.out.println(" press >> no << to exit else press any key and enter");
//			String exit = sc.next().toLowerCase();
//			if (exit.equals("no")) {
//				break;
//			}

//		}
//		for(int element:roll_arr)
//		{
//		System.out.println(element);
//		break;
//		}
//		sc.close();

	}

}
