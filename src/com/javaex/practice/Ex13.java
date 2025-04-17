package com.javaex.practice;

public class Ex13 {

	public static void main(String[]args) {
		System.out.println(13/5); 					//(1) 2
		System.out.println((double)13/5); 			//(2) 2.6
		System.out.println(13/(double)5); 			//(3) 2.6
		System.out.println((double)13/(double)5);   //(4) 2.6
		System.out.println(13.0/5);  				//(5) 2.6 
		System.out.println(13/5.0);  				//(6) 2.6   
		System.out.println((double)(13/5));  		//(7) 2.0  
		}
}
