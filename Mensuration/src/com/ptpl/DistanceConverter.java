package com.ptpl;

import java.util.Scanner;

public class DistanceConverter {

	public static void main(String[] args) {
		double km, m, cm, mm;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the distance in km");

		km = sc.nextDouble();

		m = 1000 * km;

		cm =  100 * m;

		mm =   10 * cm;

		System.out.println("Kilometer = " + km + "\nMeter = " + m + "\nCentimeter = " + cm + "\nMilimeter = " + mm);

		sc.close();

	}

}
