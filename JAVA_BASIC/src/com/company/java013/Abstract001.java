package com.company.java013;

/*		Is A / ~는 ~이다
 * 		고양이는 동물이다.
 * 		개는 동물이다.
		 Animal
		 ↑     ↑
		Cat   Dog
 */

// 일반클래스+설계
abstract class Animal{
	String name; int age;
	abstract void eat(); 	//추상메서드가 있으면 반드시 추상클래스로 만들어 줘야 한다.
	abstract void sleep(); 	//추상메서드 {} 구현부가 없음 - 공통의 속성, 구체적인 내용이 없음.(상속받은 자식에서)
	abstract void poo(); 	//추상화, 일반화, 설계하다 : 공통적인 속성, 행동 
}

//고양이는 동물이다.
class Cat extends Animal{
	@Override void eat()	{ System.out.println(super.name + "고양이 냠냠"); }
	@Override void sleep()	{ System.out.println(super.name + "고양이 코"); }
	@Override void poo()	{ System.out.println(super.name + "고양이 시원"); }
}

//강아지는 동물이다.
class Dog extends Animal{
	@Override void eat()	{ System.out.println(super.name + "강아지 냠냠"); }
	@Override void sleep()	{ System.out.println(super.name + "강아지 코"); }
	@Override void poo()	{ System.out.println(super.name + "강아지 시원"); }
}

public class Abstract001 {
	public static void main(String[] args) {
		//1. abstract class : 일반클래스 + 설계
		//Animal ani = new Animal();	new 메모리 빌리고, 객체생성/Animal()초기화 /{} 구현부가 없음
		Animal ani=null; //틀 잡기
		ani = new Cat(); //부모 = 자식 / 업캐스팅 / 타입캐스팅 필요 X
		ani.name="sally "; ani.eat();
		
		ani = new Dog();
		ani.name="alpha "; ani.eat();
		
		//2. 사용목적
		Animal[] arr = { new Cat(), new Cat(), new Dog(), new Dog() };
		int cnt=0;
		for(Animal a : arr) { a.name="ani "; ++cnt; a.eat(); }
				
	}
}
