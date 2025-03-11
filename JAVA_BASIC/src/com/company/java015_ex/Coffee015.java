package com.company.java015_ex;
//1. 바뀌면 안되게 설정 - 수정금지 - final 클래스(상속불가) 멤버변수(수정불가 : 상수) 멤버함수(오버라이딩불가)
//2. 멤버변수 초기화 - 기본값 '\u0000'/0, 'null' - 명시적 초기화 - 초기화 블록 - "생성자"
//3. 접근자의 범위를 넓은 범윙[서 좁은 범위로 적으시오.
// 	 public > protected(extends) > package(default) > private
class User004{
	//＠final 붙여 상수로 만들기
	final char division;	//A, B, C, D 4가지 타입
//	final char division = 'A';	//final 불가능, 생성자에서 초기화 (this 오류)
	final String jumin;
	
	//기본값 설정
	public User004() { this.division = 'A'; jumin="123456-1234567"; }
	//매개변수를 받는 생성자
	public User004(char division, String jumin) {
		this.division = division;
		this.jumin = jumin;
	}
	//getters/setters
	public char getDivision() { return division; }
	public String getJumin() { return jumin; }
	//toString override
	@Override public String toString() {
		return "User004 [division=" + division + ", jumin=" + jumin + "]"; }
}

/*
	접근자의 범위를 넓은 범위에서 좁은범위로 적으시오.
	User004 [division=A, jumin=123456-1234567]
	User004 [division=B, jumin=200101-1234567]
 */

public class Coffee015 {
	public static void main(String[] args) {
		User004 c1 = new User004('B', "200101-1234567"); //char타입 ' ' 로 수정
		System.out.println(c1);
		User004 c2 = new User004();
		System.out.println(c2);
	}
}
