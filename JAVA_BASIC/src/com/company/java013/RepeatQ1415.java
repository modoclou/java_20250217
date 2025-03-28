package com.company.java013;

/*
 1. 클래스 부품객체 (멤버변수+멤버함수)
 	Object			Object()			{#3					}#4
 	  ↑
 	Parent	i, j	Parent(int i, int j){#2		i=10, j=20	}#5
 	  ↑
	Child	k		Child(10, 20, 30)	{#1		k=30		}#6
 */

///호출자는 마우스 올리면 나옴

class Parent{
	int i, j;
	public Parent() { super(); } /// 1)누굴 호출한 것인지 => Object()
	public Parent(int i, int j) {
		super(); /// 2)누굴 호출한 것인지 => Object()
		this.i=i;
		this.j=j;
	}
} //end parent

class Child extends Parent{
	int k;
	public Child() { super(); } /// 3)누굴 호출한 것인지 => Parent()
	public Child(int i, int j, int k) { 
	super(i,j); /// 4)누굴 호출한 것인지 => Parent(int i, int j)
	this.k=k;
	}
} // end child

//public class ExtendsBasic007_Super{}


public class RepeatQ1415 {
	public static void main(String [] args) {
		Child child = new Child(10, 20, 30);
		System.out.println(child.i); //5) 결과 출력
		System.out.println(child.j); //5) 결과 출력
		System.out.println(child.k); //5) 결과 출력
	}
}
