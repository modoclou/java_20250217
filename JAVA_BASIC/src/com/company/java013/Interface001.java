package com.company.java013;

//1. 클래스는 부품객체
//2. 상태와 행위
// can do this
interface Animal2{
	String COMPANY="(주)동물농장"; //static final - method area, new X(메모리상에 먼저)
	void eat(); //abstract - {}(구현부) 없어서 new 못함. 말 그대로 설계목표
}

class Saram implements Animal2{
	@Override public void eat() { /*COMPANY="해물탕회사";*/ System.out.println("밥 식사...."); }
	//The final field Animal2.COMPANY cannot be assigned
}
class Pig implements Animal2{
	@Override public void eat() { /*COMPANY="해물탕회사";*/ System.out.println("꿀꾸리...."); }
}

public class Interface001 {
	public static void main(String[] args) {
		//Animal2 ani = new Animal2(); 인스턴스화 못함. 설계 목표 
		//Cannot instantiate the type Animal2 인스턴스화할 수 없는 타입
		System.out.println( Animal2.COMPANY ); //static final(자동붙음) can direct using
		//하나의 자료형으로 여러개의 타입을 관리하려고 사용 - interface, abstract, 다형성의 목적
		Animal2[] anis = {new Saram(), new Saram(), new Pig(), new Pig(), };
		for(Animal2 a: anis) { a.eat(); } //@Override - 자식 eat()
	}
}
