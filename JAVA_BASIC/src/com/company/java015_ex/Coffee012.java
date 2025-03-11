package com.company.java015_ex;

//1. 클래스는 부품객체
//2. 상태(멤버변수)와 행위(멤버함수)

import java.util.Objects;

/*
	=====커피
	커피명 : 까페라떼
	커피잔수 : 2
	커피가격 : 4000
	=====커피
	커피명 : 아메리카노
	커피잔수 : 1
	커피가격 : 2000
 */

class Coffee extends Object{
	//멤버변수
	private String name;
	private int price, num;
	//멤버함수
	void show() {
		System.out.println("=====커피\n"
				+ "커피명: " + this.name + "\n" //this를 붙이면 좋음
				+ "커피잔수: " + this.num + "\n"
				+ "커피가격: " + this.price + "\n");
	}//커피정보출력
	//생성자 - 사용자가 넣어준 값
	Coffee(String name, int num, int price){ //수동작성
		this.name = name;	this.num = num;	this.price = price;
	}
	//디폴트 생성자 깨짐.
//	Coffee() {} //1) 생성자오버로딩  2) 상속(받을때)
	Coffee() {this.name="아메리카노"; this.num=1; this.price=2000;} //기본출력
}

public class Coffee012{
	public static void main(String[] args) {		
		Coffee a1 = new Coffee("까페라떼", 2, 4000);	a1.show();
		//new 메모리 빌리고 객체 생성, Coffee(~) 초기화
		Coffee a2 = new Coffee();					a2.show();
	}
}

/**************
Repeat001.java                   <  javac Repeat001.java
Coffee.class , Repeat001.class   <  java  Repeat001 
------------------------------------------------------------
[method : 정보 보관 영역]
[1번지]Coffee.class  
[2번지]Repeat001.class  ##1
------------------------------------------------------------
[heap : 동적]                                |       [stack : 지역]
[2000]번지                         		 <----[a2 | 2000번지]
{ name="아메리카노", num=1 , price=1500 }                                   
[1000]번지                         		 <----[a1 | 1000번지]
{  name="까페라떼", num=2, price=4000  }    [main          ]
------------------------------------------------------------
*/