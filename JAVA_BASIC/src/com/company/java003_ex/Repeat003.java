package com.company.java003_ex;

import java.util.Scanner;

public class Repeat003 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int kor, eng, math, total; double avg;
		
		System.out.print("국어 점수를 입력하시오. > ");		kor = sc.nextInt();
		System.out.print("영어 점수를 입력하시오. > ");		eng = sc.nextInt();
		System.out.print("수학 점수를 입력하시오. > ");		math = sc.nextInt();
				
		total = kor + eng + math;
		avg = total/3.0;
		System.out.printf("총점 : %d \n 평균 : %.2f", total, avg);
	}
}