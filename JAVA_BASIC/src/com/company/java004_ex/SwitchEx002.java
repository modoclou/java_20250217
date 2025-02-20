package com.company.java004_ex;

import java.util.Scanner;

public class SwitchEx002 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int season;
		System.out.print("숫자 한 자리를 입력하세요. > ");	season = sc.nextInt();
		switch(season) {
			case 3 : case 4 : case 5: System.out.println("봄"); break;
			case 6 : case 7 : case 8: System.out.println("여름"); break;
			case 9 : case 10 : case 11: System.out.println("가을"); break;
			case 12 : case 1 : case 2: System.out.println("겨울"); break;			
		}
		sc.close();
	}
}