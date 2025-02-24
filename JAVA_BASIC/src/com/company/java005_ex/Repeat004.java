package com.company.java005_ex;

import java.util.Scanner;

public class Repeat004 {
	public static void main(String [] args) {
		int a = ' ';
		Scanner sc = new Scanner(System.in);

		for (;;) {
			System.out.print("1을 입력하세요. > ");	a = sc.nextInt();
			if(a==1){break;}
		}
	}
}
