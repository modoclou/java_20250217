package com.company.java005;

import java.util.Scanner;

public class ForEx006 {
	public static void main(String [] args) {
		//변수
		Scanner sc = new Scanner(System.in);
		double num, num1; char str;
		String result="";
		
		//입력
		//숫자1, 숫자2는 0~100사이만 입력가능하게 아니면 무한반복
		for(;;) {
			System.out.print("수를 입력하세요. > ");	num = sc.nextDouble();
			if(num>=0 && num1<=100) {break;} //잘 썼으면 나와 if(num 1~100)
		}
		for(;;) {
			System.out.print("수를 입력하세요. > ");	num1 = sc.nextDouble(); 
			if(num>=0 && num1<=100) {break;} //잘 썼으면 나와 if(num 1~100)
		}
		
		//연산자는 +, - ,*, /만 입력가능하게 아니면 무한반복
		for(;;) { System.out.print("연산자를 입력하세요.(+, -, *, /) > ");	str = sc.next().charAt(0);
			if(str=='+' || str=='-' || str=='*' || str=='/') {result = "" + (num+num1);}
		}
		
		//처리
		for(str=='';) { 
			if(str=='+') {result = "" + (num+num1);}
			else if(str=='-') {result = "" + (num-num1);}
			else if(str=='*') {result = "" + (num*num1);}
			else if(str=='/') {result = String.format("%.2f", (num/(float)num1));}
			else { System.out.println("다시 입력하세요.";) }
		}
		//출력
		
		System.out.println(""| ㅜㅕㅡ + ㅐㅔ + ㅜㅕㅡ2 _"=" +)
		;op='/'
	}
	}
}
