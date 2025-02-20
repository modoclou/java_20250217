package com.company.java004_ex;

import java.util.Scanner;

public class SwitchEx001 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int season;
		System.out.print("숫자 한 자리를 입력하세요.(3, 6, 9, 12) > ");	season = sc.nextInt();
		switch(season) {
			case 3: System.out.println("봄"); break;
			case 6: System.out.println("여름"); break;
			case 9: System.out.println("가을"); break;
			case 12: System.out.println("겨울"); break;
		} sc.close();
	}
}