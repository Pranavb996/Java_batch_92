package com.ptpl;

import java.util.Scanner;


class Stud
{
	private int rn;
	private String name;
	public int getRn() {
		return rn;
	}
	public void setRn(int rn) {
		if(rn<100) {
		this.rn = rn;}
		else 
			System.out.println("wrong input");
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class demo1 {
	
		public static void main(String []args) {
//			int arr[]=new int[5];
//			Scanner sc=new Scanner(System.in);
//			for(int i =0; i<=arr.length-1; i++ )
//			{
//				arr[i]=sc.nextInt();
//			}
//			for(int element:arr)
//			{
//				System.out.println(element);
//			}
			
			Stud s=new Stud();
			s.setName("nm");
			
			s.setRn(101);
			System.out.println(s.getRn());
			System.out.println(s.getName());
			
			
			
		}
	
	

}
