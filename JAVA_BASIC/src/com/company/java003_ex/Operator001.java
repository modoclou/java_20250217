package com.company.java003_ex;

import java.util.Scanner;

public class Operator001 {
	public static void main(String [] args) {
		//먼저() 값(+, -, *, /, %, ++, --) 비교( >, <, <=, <= ) 조건 (&&, ||, ?:) 대입(=)
		//1. 값(+, -, *, /, %, ++, --)
		int a=10, b=3;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b); //몫    3
		System.out.println(a%b); //나머지 1
		
		//Q1. 나머지 연산자 - 짝수 홀수 감별
		//A1. 나머지 연산자
		// 짝수: 0(짝수) 1(홀수) 2(짝수) 3(홀수) = 2로 나누었을 때 떨어진다(나머지가 0이다)
		// 0%2  = 0
		// 1%2  = 1
		// 2%2  = 0
		System.out.println( 0%2 + " " + 1%2 + " " + 2%2 + " " + 3%2); // 0 1 0 1
		
		//Q2. 3의 배수?
		// 1%3  = 1    나머지 1
		// 2%3  = 2    나머지 2
		// 3%3  = 0    나머지 2      // 3의 배수라면 0 / 나머지는 0, 1, 2
		System.out.println( 1%3 + " " + 2%3 + " " + 3%3 + " " + 3%4); // 1 2 0 3
		
		//2. 비교( ==, |=, <, >, <=(이하), >=(이상) )
		//Q1. 나머지 연산자 - 짝수 홀수 감별
		//Q2. 3의 배수?
		// 3의 배수라면 true
		System.out.println(10>3);  //true
		System.out.println(10<3);  //false
		// a=10   a가 짝수니?  == 2로 나머지 연산 시 0 == a%2==0
		System.out.println( a%2 == 0 ); //짝수표현  true
		System.out.println( a%2 == 1 ); //홀수표현  false
		//b=3  b가 3의 배수라면 == 3으로 나머지 연산 시 0 ==
		System.out.println( b%3 == 0 ); //true
		
		
		//3. 조건(  &  &&(조건1, 조건2 모든 조건 만족 시)  |  ||-둘 중에 하나라도 true. 여러 조건 중 하나-  )
		System.out.println( true  &  true ); //true
		System.out.println( true  && true ); //true 모든 조건 만족 시
		System.out.println( false &  true ); //& 처음도 false 뒤의 조건까지 읽음
		System.out.println( false && true ); //Dead code
		
		System.out.println( true  |  true ); //하나라도 조건에 맞으면 ok
		System.out.println( true  || true ); //Dead code
		System.out.println( false |  true ); 
		System.out.println( false || true ); 
		
		
		//4. 조건2      (조건)?  참:거짓
		System.out.println( (a>b)? "a>b":"a<b" );
		System.out.println( (3%2==0)? "짝수":"홀수" ); //Dead code
			
		//q1) 2의 배수이면서 5의 배수라면 true / false	
		System.out.println( a%2 == 0 && a%5 ==0 ); //true
		
		//q2) 2의 배수이면서 3의 배수라면 true / false	
		System.out.println( a%2 == 0 && a%3 ==0 ); //false
		System.out.println( a%2 == 0 || a%3 ==0 ); //true
		
		//q3) 숫자를 입력받아 0보다 크면 양수, 0보다 작으면 음수, 아니라면 0
		Scanner sc = new Scanner(System.in);
		int val;
		System.out.print("좋아하는 숫자 입력. 양수, 음수, 0 > ");
		val = sc.nextInt();
		System.out.println( (val>0)?"양수" : (val<0)?"음수":"0" );
//		char ch = ' ';
//		ch = sc.next().charAt(ch);
//		System.out.printf( ("%d>=0")? & ("%d<=0")? , val );
		
		//5. 대입
		a=10;
		System.out.println( a+=b );  //1) a+b  2) a= 1번 한 결과(계산?대입?)
		System.out.println( a-=b ); 
		System.out.println( a*=b ); 
		System.out.println( a/=b ); 
		System.out.println( a%=b ); 
		
		////// () 값 비교조선 대입
		
		//6. ++, -- ( 단항 )
		int a1=1, b1=1, c1=1, d1=1;         //1
		//                   ←
		System.out.println(++a1);   //2   1)증가 2)출력
		System.out.println(a1);     //2   위 명령어에서 이미 증가했기 때문에 값이 같다

		//                 ←
		System.out.println(b1++);   //1   1)출력 2)증가
		System.out.println(b1);     //2   뒤늦게 2가 된다(이후 증가)
		
		System.out.println(--c1);   //0   1) 1 감소 2) 출력
		System.out.println(c1);     //0
		
		System.out.println(d1--);   //1   1)출력 2)감소
		System.out.println(d1);     //0   뒤늦게 감소한다
		
	}// end main
}// end class