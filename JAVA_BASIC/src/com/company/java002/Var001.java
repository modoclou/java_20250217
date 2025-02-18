package com.company.java002;

public class Var001 {
	public static void main(String [] args) {
		//1. 변수 - 자료형   변수명
		int  a = 0;       //   a    []
		
		System.out.println("1: " + a );
				   a = 0;
				   
		a = 100000;
		System.out.println("2: " + a ); // 변하는 숫자
		
		a = 100000 - 11000;
		System.out.println("3: " + a ); // a [89000] 11000 돈가스
		
		a = a - 3000;
		System.out.println("4: " + a ); // 86000
		
		//2. 변수의 범위 {여기서부터 }여기까지
		{ int b=20; System.out.println(b); }
		// b=1000;  // b cannot be resolved to a variable
		
		//3. 변수명    $_소문자7
		int $1=1;  int _2=2; int a3bc=3;
		// int main; (O)
		// int static; int package; int class; int void; (X)
		System.out.println($1 + "/t" + _2 + "/t" + a3bc);
	}
}
