package com.company.java014;

public class Exception002 {
	public static void main(String[] args) {
		//1. try{에러날것같다} catch(에러내용){} finally{맨 마지막 무조건 처리, 생략 가능}
		try{ System.out.println(10/0); }
		catch( 			 Exception e ) { System.out.println("관리자에게 문의하세요."); }
//		catch( ArithmeticException e ) { System.out.println("관리자에게 문의하세요."); }
		finally { System.out.println("무조건 실행"); }
		
		//업캐스팅 - 부모는 자식을 담을 수 있다.
		//
		//2. throws 메서드
		
	}
}

/*
							#1. 복사 - ArithmeticException
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at com.company.java014.Exception002.main(Exception002.java:6)	#2. 줄수 exception
 */