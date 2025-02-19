package com.company.java004_ex;

import java.util.Scanner;

public class IfEx005 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		char ch = ' '; //대/소문자 판단할 변수 선언 추가?
		String result = "알파벳을 입력해 주세요!";
		System.out.print("문자 한개를 입력하세요. > ");	ch = sc.next().charAt(0);
		if(ch>='A' && ch<='Z') { System.out.println((char)(ch+32)); }
		else if(ch>='a' && ch<='z') { System.out.println((char)(ch-32)); }
		
		if(ch>='A' && ch<='Z') { result = "" + (ch+=32); }
		else if(ch>='a' && ch<='z') { result = "" + (ch-=32); }
		else System.out.print(result); // 중괄호 없이 else 옆에 바로 명령어 입력
		
//		if(ch>=65 && ch<=90) { System.out.println((char)(ch+32)); }
//		else if(ch>=97 && ch<=112) { System.out.println((char)(ch-32)); }
//		else { System.out.println("알파벳을 입력해 주세요!"); }
		sc.close();
	}
}