package com.javaex.practice;

public class Ex21 {

	public static void main(String[] args) {
		int i = 10;
		int n = ++i %2;
		
		System.out.println(i); //11
		System.out.println(n); //1 20은 i뒤에 ++이 있었지만 21에서는 i앞에 ++이 붙어서 1증가 후 대입이 되었다

	}

}
