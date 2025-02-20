package com.company.java004_ex;

import java.util.Scanner;

public class IfEx008 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in); //char한글자만 → charAt(0)문자열만
		int kor, eng, math, score; double avg;
		String num; String pass = "불합격입니다."; String scho = null; String lev;
		
		System.out.print("학번을 입력하세요 > ");	num = sc.next();
		System.out.print("국어 점수를 입력하세요 > ");	kor = sc.nextInt();
		System.out.print("영어 점수를 입력하세요 > ");	eng = sc.nextInt();
		System.out.print("수학 점수를 입력하세요 > ");	math = sc.nextInt();
		
		score = kor + eng + math;
		avg = score/3.0; //3.0f;
//		int lev = (int)avg/10; // 숫자로 레벨 매기기
		
		if(avg>=60 && kor>=40 && eng>=40 && math>=40) { pass = "합격입니다."; } // !(kor>40) = kor>=40
		
		if(avg>=95) { scho = "장학생입니다."; }
		
		if(avg>=90) { lev = "수"; }			// lev=(avg>=90)? "수" :
		else if(avg>=80) { lev = "우"; }			// (avg>=80)? "우" :
		else if(avg>=70) { lev = "미"; }				// ...
		else if(avg>=60) { lev = "양"; }
		else { lev = "가"; }	// 상단 String에 '가'를 넣을 수도 있음		// (avg>=60)?"양":"가";
	
//		System.out.printf("\n 학번 : " + num + "\n 국어 : %d \n 영어 : %d \n 수학 : %d \n 총점 : %d \n 평균 : %d \n 합격여부 : %c \n 레벨 : %d \n 장학생 : %c", num, kor, eng, math, score, avg, pass, lev, scho);
		System.out.printf("\n 학번 : " + num + "\n 국어 : %d \n 영어 : %d \n 수학 : %d \n 총점 : %d \n 평균 : %.2f \n 합격여부 : " + pass + "\n 레벨 : " + lev + "\n 장학생 : " + scho, kor, eng, math, score, avg);
	}
}