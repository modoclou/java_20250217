package com.company.java002;

import java.util.Scanner;

public class DataTypeEx004 {
	public static void main(String [] args){
		//GIGO
		//변수
		int kor, eng, math, total; double avg;
//		float lang, eng, math = 0;
		Scanner sc = new Scanner(System.in);
		
		//입력 - 국, 영, 수
		System.out.print("국어 점수를 입력하시오. > ");		kor = sc.nextInt();
		System.out.print("영어 점수를 입력하시오. > ");		eng = sc.nextInt();
		System.out.print("수학 점수를 입력하시오. > ");		math = sc.nextInt();
		
		//처리 - 총점, 평균
		total = kor + eng + math;
		avg = total/3.0; // 정수/정수 = 정수  299/3  몫 > 해결방안) 정수/실수 or 실수/정수 
		
		//출력 - 총점, 평균 출력
		System.out.printf("총점 : %d \n평균: %.2f", total, avg);
	}
}