package com.company.java004_ex;

import java.util.Scanner;

public class Switch001 {
	public static void main(String [] args) {
		//변수
		int a = 0;
		Scanner sc = new Scanner(System.in);
		
		//입력
		System.out.print("숫자 하나 입력 > ");
		a = sc.nextInt();
	
		//처리 (if/switch // for, while, do while)
		// if ver - a가 1이면 1이다, 2면 2다, 3이면 3이다
		     if(a==1) { System.out.println("a는 " + a + "입니다."); }  //if : 어떤 조건이 맞으면
		else if(a==2) { System.out.println("a는 " + a + "입니다."); }  //else : 아니라면
		else if(a==3) { System.out.println("a는 " + a + "입니다."); }
		else          { System.out.println("다시 입력해 주세요."); }		
		
		System.out.println();
		System.out.println();
		//switch는 break를 만날 때 나온다.
		// switch ver
		switch(a) {
		case 1: System.out.println("1이다."); break; //a==1
		case 2: System.out.println("2다."); break; //a==2
		case 3: System.out.println("3이다."); break; //a==3
		}
		//출력
		sc.close();
	}
}
