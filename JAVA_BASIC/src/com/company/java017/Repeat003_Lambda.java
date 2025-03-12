package com.company.java017;

interface InterTest21 { void   test(); }  
interface InterTest22 { void   test(int a); }  
interface InterTest23 { int    test(); }  
interface InterTest24 { int    test(int a); }  


public class Repeat003_Lambda {
	public static void main(String[] args) {
		//람다식으로 구현하시오.
		//Q1.
		///ver-1
		InterTest21 test11 = new InterTest21() {
			@Override public void test() { System.out.println("안녕"); }
		};
		///ver-2
		InterTest21 test1 = () -> { System.out.println("안녕"); };
		test1.test();                    	 //안녕
		
		//Q2. 
		///ver-1
		InterTest22 test22 = new InterTest22() {
//			@Override public void test(		 /* 변수선언필수 * /			 ) { System.out.println("안녕안녕"); }				
			@Override public void test(int a) { System.out.println("안녕안녕"); }				
		};
		///ver-2			변수선언 필수
		InterTest22 test2 = a -> { System.out.println("안녕안녕"); };
		test2.test(2);                     //안녕안녕
		
		//Q3. 
		///ver-1
		InterTest23 test33 = new InterTest23() {
//			@Override public int test() { System.out.println("3"); return 3; }
			@Override public int test() { return 3; }};
		///ver-2
		InterTest23 test3 =() -> 3;
		System.out.println(test3.test());  //3
		
		//Q4. 
		///ver-1
		InterTest24 test44 = new InterTest24() {
			@Override public int test(int a) { return a=30; }
		};
		///ver-2
		InterTest24 test4 = a -> a=30;
		System.out.println(test4.test(3)); //30
	}
}