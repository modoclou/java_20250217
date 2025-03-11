package com.company.java016;

// 1. 클래스는 부품객체	-	설계도 ( 틀, can do this )
// 2. 상태 + 행위		-	interface ( public static final / public abstract )
interface Inter1{ void method(); }
class	  Inter1Impl implements Inter1{
	@Override public void method() { System.out.println("Hello :D"); }	
}

public class Lambda001 {
	public static void main(String[] args) {
		//#1. interface - 구현객체 만들기
		//부모     =     자식     / 다형성 / 업캐스팅
		Inter1 a1 = new Inter1Impl(); a1.method();
		
		//#2. 익명이너클래스( test 목적, 잘 안 쓰는 이벤트 )
		Inter1 a2 = new Inter1(){
			@Override public void method() { System.out.println("Hallo :D"); }
			};
			a2.method();
		
//									 뭐 받아 처리
		//#3. Lambda 뭐 받아서 줄게(처리) () -> {}
		Inter1 a3 = ()->{ System.out.println("Hcllo :D"); };
		a3.method();
	}
}
