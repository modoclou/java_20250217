package com.company.java005;

public class ForEX004 {//1~10까지 3의 배수 갯수를 출력
	public static void main(String [] args) {
		//변수
		int val, cou = ' ';
		int cnt = 0; String result="3의 배수 : ";
		//입력
		
		//처리
		//ver-1
		//if 1이 3의 배수라면 갯수 카운트 / 2가 3의 배수라면 / 3이 3의...
		//출력구문 ()3 ,6 ,9
		//ver-2
		//if (1이 3의 배수라면) {갯수 카운트} / 2가 3의 배수라면 / 3이 3의...
		//if (1이 3의 배수라면) {갯수 카운트 ,3} / (2가 3의 배수라면) {갯수 카운트 ,6] / 3이 3의... {카운트 ,9}
		//ver-3
		// if(1%3==0){ cnt++; } / if(2%3==0){ cnt++; } / if(3%3==0) ...
		// if(1%3==0){ cnt++; System.out.println(( "??:",") +1); } / if(2%3==0){ cnt++; } / if(3%3==0) ...
		
//		for(int i=1; i<=10; i++) { if(i%3==0) ++cou; } //연산할 때마다, if 조건이 충족될 때 ++cou의 값 추가
//		for(int i=1; i<=10; i++) { (i==0? "" : ", ") + i) ++act; }
		
		//출력
//		System.out.println("3의 배수 : " + act);
		for(int i=1; i<=10; i++){ if(i%3==0){ cnt++; result += ( cnt==1?"":",") +i; } }
		System.out.println( result = "\n갯수 : " + cnt );
//		System.out.println("\n1부터 10까지의 정수 중 3의 배수의 갯수 = " + cou);
	}
}