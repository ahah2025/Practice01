package com.javaex.practice;

public class Ex24 {

	public static void main(String[] args) {

		double f=80.0;
		/*System.out.println(5/9*(f-32.0)); 
		double은 실수형이어서 5와 9도 실수형(소수점)으로 만들면 26.6666668이 나올 수 있음
		*/
		System.out.println(5.0/9.0*(f-32.0));
		//정수형+실수형의 결과값은 0이 나올 수 밖에 없다
	}

}
