package com.javaex.practice;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로: ");
		double w = sc.nextDouble();
		System.out.print("세로: ");
		double h = sc.nextDouble();
			
		System.out.println("삼각형의 넓이는 " + (w*h/2)+" 입니다.");
		
		sc.close();

	}

}
