package com.company.java004_ex;

import java.util.Scanner;

public class IfEx004_2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int in = ' '; // int in = '\u0000';   or   char ch = ' ';
		String result = "알파벳만 입력 가능합니다!";
		System.out.print("문자 하나를 입력하시오. > ");	in = sc.next().charAt(0); // "abc"문자열 a(0), b(1), c(2) / charAt.(0)
		     if(in>='A' && in<= 'Z') { result = "대문자입니다."; }
		else if(in>='a' && in<= 'z') { result = "소문자입니다."; }
		
		System.out.println(result); //so / ctrl+shift / ↓ 2번 선택시 바로 입력
		sc.close();
	}
}