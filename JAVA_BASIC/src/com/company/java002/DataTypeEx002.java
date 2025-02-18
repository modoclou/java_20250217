package com.company.java002;

import java.util.Scanner;

public class DataTypeEx002 {
	public static void main(String [] args){
		//GIGO(Garbage In Garbage Out)
		// 변수 - 입력 - 처리 - 출력
		
		//1. 변수
		int numtype = 0;
		Scanner sc = new Scanner(System.in);
		
		//2. 입력 - 좋아하는 수(정수) 입력하세요. > _입력받기
		System.out.println("좋아하는 수(정수)를 입력해주세요. > ");
		numtype = sc.nextInt();
				
		//3. 처리 X
		//4. 출력 - 좋아하는 숫자는 ** 입니다.
//		System.out.println("좋아하는 숫자는 " + numtype + "입니다.");		
		System.out.printf("좋아하는 숫자는 %d입니다.", numtype);		
	}
}