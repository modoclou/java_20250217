package com.company.java004_ex;

import java.util.Scanner;

public class IfEx008 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int kor, eng, math, score; double avg; char num;
		
		System.out.print("학번을 입력하세요 > ");	num = sc.next().charAt(0);
		System.out.print("국어 점수를 입력하세요 > ");	kor = sc.nextInt();
		System.out.print("영어 점수를 입력하세요 > ");	eng = sc.nextInt();
		System.out.print("수학 점수를 입력하세요 > ");	math = sc.nextInt();
		
		score = kor + eng + math;
		avg = score/3.0;
		int lev = (int)avg/10;
		
		if(avg>=60 && kor<40 && eng<40 && math<40) { System.out.print("불합격입니다."); }
		else { System.out.print("합격입니다."); }
		
		if(avg>=95) { System.out.print(" 장학생입니다."); }
		else if(avg>=90) { System.out.print("수"); }
		else if(avg>=80) { System.out.print("우"); }
		else if(avg>=70) { System.out.print("미"); }
		else if(avg>=60) { System.out.print("양"); }
		else { System.out.print("가"); }
		
//		System.out.printf("학번 : num \n 국어 : %d \n 영어 : %d \n 수학 : %d \n 총점 : %d \n 평균 : %d \n 합격여부 : %c \n 레벨 : %d \n 장학생 : %c", kor, eng, math, score, avg, 합격여부, lev, 장학생);
	}
}
