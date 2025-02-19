package com.company.java003_ex;

import java.util.Scanner;

public class CastingEx001 {
	public static void main(String [] args) {
		// 변수
		int one, two; double result;
		Scanner sc = new Scanner(System.in);
		
		//입력
		System.out.print("숫자입력1 > ");	one = sc.nextInt();
		System.out.print("숫자입력2 > ");	two = sc.nextInt();
		
		//처리
		result = (double)one/two;
		//출력
//		byte by = (byte) two;
		System.out.println(one + "/" + two + "=" + String.format("%.2f",result));
		System.out.printf("%d / %d = %.2f", one, two, result );
	}
}
