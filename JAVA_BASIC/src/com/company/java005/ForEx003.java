package com.company.java005;

public class ForEx003 { //1~10까지의 합을 구하시오.
	public static void main(String [] args) {
		//변수
		int val = 0;
		
		//입력 값이 누적?
		
		//처리
		
		for(int i=1; i<=10; i++) { val += i; } //연산은 중괄호 안에서 일어나므로 결괏값이 될 수식만 입력
		// val += 2 /=/ val = val + 2
		
		//출력
		System.out.println("1부터 10까지 정수의 합은? = " + val);
	}
}