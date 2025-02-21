package com.company.java005;

import java.util.Scanner;

public class Repeat_001_For2 {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//무한반복
		for(;;) { //조건이 없으면 무한반복
			System.out.print("\n숫자 1을 입력하시오. > ");	int a = sc.nextInt();
			if(a==1) {break;}
			// a가 1이라면 나가기, #2. 나갈 조건
			System.out.println();
			
			//for - break / 3 뒤로 없어짐!
			for(int i=1; i<=10; i++) {
				if(i==3) {break;}
				System.out.print(i + "\t");
			}
			System.out.println();
			
			//for - continue / 한 번만 스킵
			for(int i=1; i<=10; i++) {
				if(i==3) {continue;}
				System.out.print(i + "\t");
			}
		}
	}
}
