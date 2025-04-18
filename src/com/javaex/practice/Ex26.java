package com.javaex.practice;

import java.util.Scanner;

public class Ex26 {
	
	public static void main(String[] args) {
		
		/*월급을 입력받아 10년동안 최대 저축액을 계산하는 프로그램을 작성
		월급을 입력하세요 : 200
		10년 동안 최대 저축액은 24000원 입니다.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월급을 입력하세요 : ");
		int money = sc.nextInt();
		
		int a = money * 120;
		
		System.out.println("10년 동안 최대 저축핵은 "+ a + "원 입니다.");
		
		sc.close();
	}
}
