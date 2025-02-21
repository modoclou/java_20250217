package com.company.java005;

import java.util.Scanner;

public class ForEx002 {
	public static void main(String [] args) {
		//변수
		Scanner sc = new Scanner(System.in);
		int val;
		
		//입력
		System.out.print("출력할 단을 입력해 주세요.(2~9) > ");	val = sc.nextInt();
		
		//처리
		for(int i=1; i<=9; i++) { System.out.println(val + "*" + i + "=" + (val*i)); }
		//출력
	}
}