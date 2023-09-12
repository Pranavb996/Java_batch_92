package com.ptpl;

public class DataType3 {

	public static void main(String[] args) {
		// float f = 3.1412; ---> you cant directly store decimal point value in float instead of double 
		
		/* If you want to store it in float then you should try
		 * some types which are  mentioning belove......
		 *  
		 */
		
		float f1 = (float) 3.1214; // (float)3.1214;
		System.out.println(f1); 
		
		float f2 = 3.1214f; // 3.1214f;
		System.out.println(f2);
		
		float f3 = 3.1214F;  // 3.1214F;
		System.out.println(f3);
	}

}
