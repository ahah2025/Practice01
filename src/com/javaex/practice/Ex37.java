package com.javaex.practice;

import java.util.Scanner;

public class Ex37 {

	public static void main(String[] args) {
		//문제의 답과 다름
		int pencil;
		int all;
		int a;
		int i;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("전체 연필개수를 입력해주세요: ");
		pencil = sc.nextInt();
		System.out.print("전체 인원수를 입력해주세요:  ");
		all= sc.nextInt();
		
		a = pencil / all ;
		i = a/1;
		
		System.out.print("1인당 연필의 갯수는 " + i + "입니다.");
		i = sc.nextInt();
		System.out.println("연필의 나머지 갯수는 "+ (pencil%all-(all+3%2)) +" 입니다.");
		
		sc.close();	
	}

}
/*
전체 연필개수를 입력해주세요: 127
전체 인원수를 입력해주세요:  3
1인당 연필의 갯수는 42입니다.
========================================
전체 연필개수를 입력해주세요: 45
전체 인원수를 입력해주세요:  5
1인당 연필의 갯수는 9입니다.
*/