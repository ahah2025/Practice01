package com.javaex.practice;

public class Ex35 {

	public static void main(String[] args) {
		
		long speed = 300000;
		long distance; //거리
		
		//거리계산
		distance = speed * 60 * 60 * 24 * 365;
		System.out.println("빛이 1년 동안 가는 거리는 "+ distance + " km 입니다.");
	}

}
