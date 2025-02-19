package com.company.java004_ex;

import java.util.Scanner;

public class IfEx002 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int in = ' ';
		System.out.print("숫자 한개를 입력하세요. > ");		in = sc.nextInt();
		     if(in>0) { System.out.println("양수입니다."); }
		else if(in<0) { System.out.println("음수입니다."); }
		else          { System.out.println("zero입니다."); }
	}
}