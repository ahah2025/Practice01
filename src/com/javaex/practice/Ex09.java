package com.javaex.practice;

public class Ex09 {
	public static void main(String[]args) {
		//int 4byte 정수형
				
		//강제형변환 --> 확대 short(2) --> int(4)
		short a = 49;  
		System.out.println(a); //49
		int b = (int)a;
		System.out.println(b); //49
		
		//강제형변환 --> 축소 double(8) --> int(4)
		double e = 50;
		System.out.println(e); //50.0
		int f = 50;
		System.out.println(f); //50
		
		//강제형변환 float(4)--> int(4)
	    float var01 = 137.920486f;
	    int var02 = (int)var01;
	    System.out.println(var02); //137
		
		//강제형변환 --> 확대 byte(1)  --> int(4)
		byte c = 15;
		System.out.println(c); //15
		
		int d = (int)c;
		System.out.println(d); //15
						
		//강제형변환  확대 char(2) --> int(4)
		char var03 = 84;
		int var04 = (int)var03;
		System.out.println(var04); //84
		
		// boolean ( 1 ) ( 4 )
		boolean a01 = true;
		boolean a02 = false;
		System.out.println(a01);
		System.out.println(a02);
		
		int m = 10;
		int k = 29;
		boolean result = m<k;
		System.out.println(result);
	
		// long ( 8 ) ( 4 )
		long c01 = 6;
		int c02=(int)c01;
		System.out.println(c02); //6
	}

}
