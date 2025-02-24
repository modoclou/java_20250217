package com.company.java005_ex;

import java.util.Scanner;

public class Repeat002 {
	public static void main(String [] args) {
		int a=' ';
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요. (10, 20, 30) > ");	a = sc.nextInt();
		
		switch(a) {
		case 10 : System.out.print("a는 " + a + "입니다."); break;
		case 20 : System.out.print("a는 " + a + "입니다."); break;
		case 30 : System.out.print("a는 " + a + "입니다."); break;
		}
	}
}
