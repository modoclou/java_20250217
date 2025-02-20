package com.company.java004_ex;

import java.util.Scanner;

public class IfEx007 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		double num, num1; char str; //char는 문자열 입력
		System.out.print("정수를 하나 입력해주세요 > ");	num = sc.nextDouble();
		System.out.print("정수를 하나 입력해주세요 > ");	num1 = sc.nextDouble();
		System.out.print("연산자를 하나 입력해주세요(+,-,*,/) > "); str = sc.next().charAt(0); //charAt(0) 1글자
		// 10 + 3 = 13

			 if(str=='+') { System.out.println(num + num1); }
		else if(str=='-') { System.out.println(num - num1); }
		else if(str=='*') { System.out.println(num * num1); }
		else if(str=='/') { System.out.println(num / num1); }
	}
}