package com.company.java003_ex;

public class Casting001 {
	public static void main(String [] args) {
		//#1. 형변환 - 자동타입변환
		byte by = 1; short sh = 2; int in = 4; long l = 8L;
		float f = 3.14f; double d = 3.14;
		
		sh = by; // 정수(2byte) = 정수(1byte)
		in = by; // 정수(2byte) = 정수(1byte)
		l = by; // 정수(2byte) = 정수(1byte)
		
		l = (long) f; // 정수 (8byte) = 정수(4byte)  정수 < 실수
				l = (long) f; // Type mismatch: cannot convert from float to long
		f = l; // 실수(4byte) = 정수(8byte)
		
//		boolean bl = true;
//		in = bl; // boolean은 형변환 안됨.
		
		//#2. 형변환 - 강제타입변환
		by = (byte) in;    //정수(1byte) - 정수(4byte)
		
		int in2 = (int) 1.2;
		float fl2 = (float) 3.1411111111;
		// 실수(4byte) - 실수(double : 8byte)
		// float : 소수점 7자리 - double : 15자리
		
		System.out.println(in2); //1
		System.out.println(fl2); //1
		
		//	Q1) System.out.println( 1.5 + 2.7 ); // 결과 : 3
		System.out.println( 1.5 + 2.7 );
		System.out.println( (int)1.5 + (int)2.7 );
		
		
	}
}
