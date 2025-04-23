package com.javaex.practice;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		
		double r;
		double v;
		
		Scanner sc = new Scanner(System.in);
		
		//반지름 입력
		System.out.print("반지름: ");
		r = sc.nextDouble(); 
		
		//구의 부피 계산
		v = (double)4/(double)3*3.14*(r*r*r);
		
		//구의 부피 출력
		System.out.println("구의부피는: " + v +" 입니다.");
		
		sc.close();
	}

}
