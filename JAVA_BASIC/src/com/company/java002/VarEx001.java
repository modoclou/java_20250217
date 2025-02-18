package com.company.java002;

public class VarEx001 {
	public static void main(String [] args) {
		int apple = 0;
		apple = 1000;
		System.out.println("사과 가격은 " + apple + "원입니다.");
		
		apple = 2000;
		System.out.printf("사과 가격은 %d원입니다.", apple);
	}
}