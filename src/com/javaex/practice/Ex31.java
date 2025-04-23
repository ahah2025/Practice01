package com.javaex.practice;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품가격: ");
		double money = sc.nextDouble();
		System.out.print("받은돈: ");
		double i = sc.nextDouble();
		System.out.println("========================");
		
		System.out.println("받은돈: " + i);
		System.out.println("상품가격: "+ money);
		System.out.println("부가세 : " + ( money * 0.1 ));
		
		System.out.println("잔액: " + (i-money));
		
		sc.close();
	}

}

/*
 
결 과 값
상품가격: 7500
받은돈: 10000
========================
받은돈: 10000.0
상품가격: 7500.0
부가세 : 750.0
잔액: 2500.0


*/