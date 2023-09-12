package com.ptpl;

public class DataType4 {

	public static void main(String[] args) {
		
	//some types will never convert into any other data type eg..
		
		boolean b = true;
		int p = 9;
		String a = "Pranav";
		
		//b =(boolean) a; ------>Cannot cast from String to boolean
		//b =(boolean) p; ------>Cannot cast from int to boolean
	}

}
