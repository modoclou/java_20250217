package com.company.java003_ex;

import java.util.Scanner;

public class CastingEx002 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int kor, eng, math, total, lev; double avg;
		
		System.out.print("국어 점수를 입력하시오. > ");	kor = sc.nextInt();
		System.out.print("영어 점수를 입력하시오. > ");	eng = sc.nextInt();
		System.out.print("수학 점수를 입력하시오. > ");	math = sc.nextInt();
		
		total = kor + eng + math;
		avg = total/3.0;	//(double)total/3;	total/(double)3;	(double)total/(double)3;
		lev = (int)avg/10;
		System.out.printf(":: GOOD  IT SCORE ::\n 국어 : %d \n 영어 : %d \n 수학 : %d \n 총점 : %d \n 총점 : %.2f \n 레벨: %d ", kor, eng, math, total, avg, lev);
//		System.out.printf("%d\t%d\t%d\t%d\t%.2f\t%d\t", kor, eng, math, total, avg, lev);
//		String.format("%.2f", avg)+ "/t"+level
	}
}