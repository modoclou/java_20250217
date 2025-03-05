package com.company.java012;

// 1. 클래스는 부품객체
// 2. 상태(멤버변수)와 행위(멤버함수)
/* 3. 상속 - 재활용
 * Object  {   } 
 * ↑
 * A1      int a
 * ↑
 * B1      int b
 * ↑
 * C1      int c
 *
 */
class A1 extends Object {
	int a;	public A1() { super(); } //Object ()
	//ctrl + shift + f
}
class B1 extends A1 {
	int b;	public B1() { super(); } // A1 ()
}
class C1 extends B1 {
	int c; 	public C1() { super(); } // B1 ()
	public void show() { System.out.println(a + "/" + b + "/" + c); }
}
public class Extends001 {
	public static void main(String[] args) {
		C1 c1 = new C1();
		c1.a=1; c1.b=2; c1.c=3; c1.show();
	}
}
/* C1 c1 = new C1(); ← main 호출
[method] A1.class, B1.class, C1.class, public Extends001.class
------------------------------------------------------------
[heap]                 | [stack]
		   Object(){#3-4	}#3-5 Object 틀 사용 가능하게 만들어 주다
         {a=0} A1(){#3-3    }#3-5 a=0으로 초기화
		 {b=0} B1(){#3-2    }#3-7 b=0으로 초기화
19번 1번지 {c=0} C1(){#3-1    }#3-8 c=0으로 초기화
						   ←  c1 1번지
					   | main #2
------------------------------------------------------------
 */