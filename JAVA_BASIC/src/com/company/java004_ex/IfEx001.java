package com.company.java004_ex;

import java.util.Scanner;

public class IfEx001 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		float  fl = ' '; // int avg; String result = "불합격";
		System.out.print("평균을 입력하세요. > ");		fl = sc.nextFloat();
		if(fl>=60) { System.out.println("합격입니다."); } // if(fl>=60) { result = "합격입니다."; }
		else       { System.out.println("불합격입니다."); } // 한줄에? 불합격 - 조건에 맞으면 힙격
	
		// System.out.println(result);
	}
}