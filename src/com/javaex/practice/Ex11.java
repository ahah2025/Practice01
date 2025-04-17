package com.javaex.practice;

public class Ex11 {
	public static void main(String[]args) {
		int iVar = 10;
		System.out.println(iVar);
		
		long IVal = 100000000000000L;
		System.out.println(IVal);
		
		char cVar='f';
		System.out.println(cVar); //ab는 입력이 안됨 'f'
		
		double dVar = 10;
		System.out.println(dVar); //10.0
		
		float fVar = 12.4f; //12.4 라고만 입력하는게 아닌 뒤에 f를 붙여야 함
		System.out.println(fVar);
		
		String str ="ab"; //" 쌍 따옴표로 입력해야 값이 나옴.  하나의 따옴표는 오류 뜸' 
		System.out.println(str);
	}

}
