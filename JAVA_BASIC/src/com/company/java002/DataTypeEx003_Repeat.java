package com.company.java002;

import java.util.Scanner;

public class DataTypeEx003_Repeat {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int kor, eng, math, total; double avg;
		
		System.out.print("국어 점수를 입력하세요. > ");	kor = sc.nextInt();
		System.out.print("영어 점수를 입력하세요. > ");	eng = sc.nextInt();
		System.out.print("수학 점수를 입력하세요. > ");	math = sc.nextInt();
		
	total = kor + eng + math;
	avg = total/3.0;
	
	System.out.printf("총점 : %d\n평균 : %.2f", total, avg);
	}
}
