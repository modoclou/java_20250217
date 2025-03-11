package com.company.java015_ex;

import java.util.Scanner;

public class Coffee020 {
	private static Scanner sc;
	public static int nextint() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1을 입력하세요. > "); 
		return sc.nextInt(); //a
	}
	public static void main(String[] args) {
		int one = 0;
		while(true) {
			try{ one = nextint();
			if(one==10) {break;}
		} catch(Exception e) {
			sc.next();
		System.out.println("숫자만 입력 가능합니다.");}
		}
	}	
}