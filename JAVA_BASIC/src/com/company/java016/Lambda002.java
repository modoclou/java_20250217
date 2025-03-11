package com.company.java016;

interface InterA2{void hi1();}    
interface InterB2{void hi2(String name);}  
interface InterC2{String hi3();}   
interface InterD2{String hi4(int num, String name);}  

public class Lambda002 {
	public static void main(String[] args) {
		System.out.println("[STEP1] 매개변수 X, 리턴값 X"); //void hi1()
		//1-1. 익명객체	hi 출력
		InterA2 a1 = new InterA2() {
			@Override public void hi1() {System.out.println("hi");}
			}; a1.hi1();
		
		//1-2.Lambda식 ()->{}
			InterA2 a2 = ()->{ System.out.println("hii"); }; a2.hi1();
			InterA2 a3 = ()->System.out.println("hiii"); a3.hi1();
			
		System.out.println("\n[STEP2] 매개변수 O, 리턴값 X");
		//interface InterB2{void hi2(String name);}
		//2-1. 익명객체	hi sally!
			InterB2 b1 = new InterB2() {
				@Override public void hi2(String name) { System.out.println("hi sally!"); }
				}; b1.hi2("sally");
		//2-2. 람다식 ()->{}
//			InterB2 b2 = (변수)->{}
			InterB2 b2 = (String name)->{ System.out.println("hi " + name + "!"); }; b2.hi2("sally");
			InterB2 b3 = (name)-> System.out.println("hi " + name + "!"); b3.hi2("sally");
			InterB2 b4 = name->System.out.println("hi " + name); b4.hi2("sally!");
			
			System.out.println("\n[STEP3] 매개변수 X, 리턴값 O");
			//interface InterC2{String hi3();}
			//3-1. 익명객체	good day!
			InterC2 c1 = new InterC2() { @Override public String hi3() { return "good day!"; } };
			System.out.println( c1.hi3() );
				
			//3-2. 람다식 ()->{}
			InterC2 c2 = ()->{ return "good day!"; }; System.out.println(c2.hi3());
			InterC2 c3 = ()-> "good day!"; System.out.println(c3.hi3());
			
			System.out.println("\n[STEP4] 매개변수 O, 리턴값 O");
			//interface InterD2{String hi4(int num, String name;}	*문자열추가
			//4-1. 익명객체	Hi sally! * System.out.println( d1.hi3(1, "sally") );
			InterD2 d1 = new InterD2() { @Override public String hi4(int num, String name) {
				return "Hi " + name + "☆".repeat(num); //repeat 문자열반복
			}}; System.out.println( d1.hi4(1, "sally ") );
			
			//4-2. 람다식 ()->{}
			InterD2 d2 = (int num, String name)->{ return "Hi " + name + "☆".repeat(num); };
			System.out.println( d2.hi4(1, "sally ") );
			
			InterD2 d3 = (num, name)-> "Hi " + name + "☆".repeat(num);
			System.out.println( d3.hi4(1, "sally ") );
	}
}
