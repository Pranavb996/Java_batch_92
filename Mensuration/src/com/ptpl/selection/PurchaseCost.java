package com.ptpl.selection;

import java.util.Scanner;

public class PurchaseCost {

	public static void main(String[] args) {
		
		double item_price, Tot_cost, Disc_cost=0;
		int quantity ;
		
		Scanner sc = new Scanner (System.in);				
		System.out.println("Enter item cost price");
		item_price = sc.nextDouble();
		System.out.println("Enter quantity of item : ");
		quantity =sc.nextInt();
		Tot_cost = item_price * quantity;
		
		if(Tot_cost>=1000) {
			Disc_cost= (Tot_cost*10)/100;
			Disc_cost= Tot_cost-Disc_cost;
			
		}
		else if(Tot_cost>=500 && Tot_cost<1000 )
		{
			Disc_cost = (Tot_cost*5)/100;
			Disc_cost= Tot_cost-Disc_cost;
			
		}
		else
			Disc_cost= Tot_cost;
		System.out.println("After Discount Final price is : "+Disc_cost);
	}

}
