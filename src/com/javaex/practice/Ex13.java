package com.javaex.practice;

public class Ex13 {

	public static void main(String[]args) {
		
		System.out.println(13/5); 					//(1) 13과 5는 정수여서 2가 나온다
		System.out.println((double)13/5); 			//(2) 2.6
		System.out.println(13/(double)5); 			//(3) 2.6
		System.out.println((double)13/(double)5);   //(4) 2.6
		System.out.println(13.0/5);  				//(5) 2.6 
		System.out.println(13/5.0);  				//(6) 2.6   
		System.out.println((double)(13/5));  		//(7) 13과 5 둘다 정수이므로 2가 계산되는데 같이 형변환되어 2.0이 된것이다
	
	}
}
