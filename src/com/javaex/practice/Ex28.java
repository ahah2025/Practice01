package com.javaex.practice;

import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
				
		final double $ = 1230.95;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("환전할 원화를 입력하세요: ");
		
		double won = sc.nextDouble();
		
		double dollars = won / $ ;
		
		System.out.println("받으실 달러는 "+ dollars );
		
		System.out.print("환전할 원화를 입력하세요: ");
		
		double m = sc.nextDouble();
		
		double changes = m / $;
		
		System.out.println("받으실 달러는 " + changes);
		
 		sc.close();

	}

}
