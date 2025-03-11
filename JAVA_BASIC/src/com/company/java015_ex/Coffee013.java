package com.company.java015_ex;

//1. 클래스는 부품객체이다.
//2. 상태(멤버변수)와 행위(멤버함수)

class A{
	int a; //인스턴스 변수, heap area, new O, 실체화 this 각각
	static String company; //클래스변수, method area, new X, 공용
	void method() {int a;}
	//지역변수, stack, 임시 *주의사항: 무조건 초기화(수동으로 시켜줘야 함. 예시: int a = 0;
}

//오류날만한 코드: int a;
//왜: this.a는 인스턴스 변수 참조 a는 지역변수 참조
//인스턴스변수 - heap - new O - this, 생성자

public class Coffee013 {
	public static void main(String[] args) {
		
	}
}
