package com.javaex.practice;

import java.util.Scanner;

public class Ex29 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로를 입력하세요: ");
		double width = sc.nextDouble(); //너비
		
		System.out.print("세로를 입력하세요: ");
		double height = sc.nextDouble(); //높이
		
		System.out.println("사각형의 넓이는 "+ width*height);
		System.out.print("사각형의 둘레는 "+ (width*height+2));
		
		
		sc.close();
	}

}
