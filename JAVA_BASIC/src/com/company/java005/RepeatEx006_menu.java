package com.company.java005;

import java.util.Scanner;

public class RepeatEx006_menu {
	public static void main(String [] args) {
		//1. 변수
		int num = -1;
		Scanner sc = new Scanner(System.in);
		
		//기능1) 2. 입력 3. 처리 4. 출력
		for(;;) { //무한
			System.out.println("메뉴판입니다. 9. 종료 > ");
			num = sc.nextInt();
			if(num==9) {break;} // 빠져나올 조건
		}
	}
}
