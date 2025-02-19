package com.company.java003_ex;

public class OperatorEx001 {
	public static void main(String [] args) {
		int a=3, b=10;
		System.out.println( b+=10 - a-- );         //(10+10)-3= 17
		System.out.println( a+=5 );                //{(3-1)+5}=7
		System.out.println( a>=10 || a<0 && a>3 );
		//a=7이므로 10보다 작다(a>/=10). 0보다 작은 음수도 아니고, 3보다 큰 수이긴 하지만
		//&&(and)가 ||보다 우선순위가 높으므로 결과는 false가 된다.
		// false || false < || Dead code
	}
}