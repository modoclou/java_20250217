package com.company.java004_ex;

import java.util.Scanner;

public class Repeat001 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int a = ' ';
		
		System.out.print("1, 2, 3 중 숫자 하나를 입력하세요. > ");	a = sc.nextInt();
		
		if(a==1) { System.out.println("a는 " + a + "입니다."); }
		else if(a==2) { System.out.println("a는 " + a + "입니다."); }
		else if(a==3) { System.out.println("a는 " + a + "입니다."); }
		else { System.out.println("1, 2, 3 중 하나를 입력하세요."); }
	}
}