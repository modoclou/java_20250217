package com.company.java002;

import java.util.Scanner;

public class DataTypeEx003 {
	public static void main(String [] args) {
		//GIGO
		//변수 (7자리 float / 15자리 double)
//		float pi=0.0f;
		double d = 3.14;
		Scanner sc = new Scanner(System.in);
		
		//입력
//		pi = scanner.nextFloat();
		System.out.println("파이값을 입력하시오. > ");
		d = sc.nextDouble();
		
		//처리  X
		//출력  파이값은 **입니다.
//		System.out.println("파이값은 " +pi+ "입니다.");
//		System.out.printf("파이값은 %f입니다.\n", pi);
//		System.out.printf("파이값은 %2f입니다.\n", pi);
//		System.out.printf("파이값은 %3f입니다.\n", pi);
		System.out.println("파이값은 " + d + "입니다.");
	}
}