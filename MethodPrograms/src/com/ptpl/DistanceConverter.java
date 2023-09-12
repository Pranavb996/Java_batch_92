package com.ptpl;

import java.util.Scanner;

public class DistanceConverter {

	public static void main(String[] args) {
		distanceConvert(1);

	}

	public static void distanceConvert(double km) {
		double m, cm, mm;

		m = 1000 * km;

		cm =  100 * m;

		mm =   10 * cm;

		System.out.println("Kilometer = " + km + "\nMeter = " + m + "\nCentimeter = " + cm + "\nMilimeter = " + mm);
	}

}
