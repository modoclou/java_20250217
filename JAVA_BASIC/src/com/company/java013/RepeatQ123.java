package com.company.java013;

//1. 클래스 부품객체
//Q1. 클래스변수, 인스턴스변수, 지역변수 / 클래스메서드, 인스턴스메서드

class A12{
	int a; //(1) 인스턴스 변수 - heap area - new O - this 각각
	
	public A12() { super(); }
	public A12(int a) {	super(); this.a = a; } //2
//	A11(){}
//	A11(int a){ this.a=a; } //(2) - 지역변수 - stack area
	//(3) void show() - 클래스 메서드
	void show() { this.a=11; System.out.println(this.a); } //3 인스턴스 메서드 - heap area - new O - this 각각
	//(4) static void classMethod()
	static void classMethod() { this.a=12; }  //4 클래스 메서드 - method area - new X - 공유영역
	//static이 jvm 로딩 시 제일 먼저 메모리상에 올라감. this는 new 연산자를 이용해 사용해야 함. 순서가 맞지 않는다.
	//static은 instance 사용 불가.
	//Cannot use this in a static context
	//(5) int show2() - 인스턴스 메서드 - heap area - new O - this 각각
	//아래의 int a;는 show2에서만 사용 가능. show2 안에 있는 int a는 지역변수
	//int a는 stack - 임시공간 - 변수 초기화가 안 된다(개발자가 해야 한다).
	int show2() {int a; return a;} //The local variable a may not have been initialized
	}

public class RepeatQ123 {
	public static void main(String[] args) {
		A12 a1 = new A12(); (b) //b cannot be resolved to a variable
		///03
		///메모리 빌려오고 객체 생성: new
		///String은 null, int는 0으로 초기화하는 역할: A11()
		///new A11()한 주소를 갖고 있는 것은: a1
		
		///04 기본생성자를 반드시 선언해야 하는 경우
		///다운캐스팅...
		
		///05 오버로딩이 성립하기 위한 조건이 아닌 것은?
		///a. 메서드의 이름이 같아야 한다.				(O)
		///b. 매개변수의 개수나 타입이 달라야 한다.		(O)
		///c. 리턴타입이 달라야 한다.					(X)
		///d. 매개변수의 이름이 달라야 한다.			(X)
	}
} //end class