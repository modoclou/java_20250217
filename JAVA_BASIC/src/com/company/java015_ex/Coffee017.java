package com.company.java015_ex;

/*
	Q1) 클래스를 상속하는 이유를 적으시오.
	재사용을 위해 (공통된 속성 공유?)
	Q2) 상속의 형식을 적으시오.
	class 자식 extends 부모
	Q3) Object			#4 Object(){		#5} 객체생성
		 ↑
		 A1	{a}			#3 A1() {	a=10;	#6}
		 ↑
		 B1	{b}			#2 B1() {	b=0;	#7}
		 ↑
		 C1	{c}			#1 C1() {	c=0;	#8} 
		 
		 객체호출순서: C1() 	B1() 	A1()	Object()
		 객체생성순서: Object 	A1 		B1 		C1
		 
	abstract, interface
	extends	  implements
*/


//Q3) ##을 채우고 출력되는 결과를 적으시오.
//1- 10 / 2- 20 / 3- 30

class A1 extends Object { // [##1] Object를 상속받는다
	int a;
	public A1() { super(); }
	public A1(int a) { super();	this.a = a;	}
}

class B1 extends A1{ // [##2] A1을 상속받는다
	int b;
	public B1() { super(); }	
	public B1(int b) { this.b = b; }
	public B1(int a, int b) { super(); this.b = b; }
}

class C1 extends B1{
	int c;
	public void showC() {
		System.out.println("상속받은 A클래스의 a: " + a);
		System.out.println("상속받은 B클래스의 b: " + b);
		System.out.println("자신의 멤버 C클래스의 c: " + c);
	}
}

public class Coffee017 {
	public static void main(String [] args) {
		C1 myc = new C1();
		myc.a = 10; myc.b = 20; myc.c = 30; myc.showC();
	}
}

/*
class A1 extends Object { int a; public A1() { super(); } }
class B1 extends A1     { int b; public B1() { super(); } }
class C1 extends B1     { int c; public C1() { super(); }  
   public void showC() {
      System.out.println("상속받은 A클래스의 a : " + a);
      System.out.println("상속받은 B클래스의 b : " + b);
      System.out.println("자신멤버의 C클래스의 c: " + c);
   }
}
public class Repeat006_1 extends Object {
  public static void main(String[] args) {              
   C1  myc = new C1();   
   myc.a = 10; myc.b=20; myc.c=30;
   myc.showC();
  }
}
*/