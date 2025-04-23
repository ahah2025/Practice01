package com.javaex.practice;

import java.util.Scanner;

public class Ex38 {

	public static void main(String[] args) {
		//결과 값이 0으로만 나옴
		int all;
		int n=(1000%50);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("전체금액을 입력해주세요: ");
		all = sc.nextInt();
				
		System.out.println("실제지불금액은 "+ n +" 입니다.");
		
		sc.close();	

	}

}
/*
전체금액을 입력해주세요: 15270
실제지불금액은 0 입니다.

전체금액을 입력해주세요: 999
실제지불금액은 0 입니다.

전체금액을 입력해주세요: 3752452
실제지불금액은 0 입니다.
*/