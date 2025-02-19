package com.company.java004_ex;

import java.util.Scanner;

public class IfEx003 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int in = ' ';
		System.out.print("1, 2, 3 중 숫자 한 개를 입력하시오. > ");		in = sc.nextInt();
		     if(in==1) { System.out.println("one"); }
		else if(in==2) { System.out.println("two"); }
		else if(in==3) { System.out.println("three"); }
		else           { System.out.println("1, 2, 3이 아닙니다."); }
	}
}