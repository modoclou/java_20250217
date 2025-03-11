package com.company.java015_ex;

//Q1. 상속도 그리기
//Q2. 각클래스에서 사용할수있는 멤버변수/멤버메서드
/*
		Object
		  ↑
		 Papa   { money=10000 /sing()GOD-거짓말 }
		  ↑ 
		 Son	{ money=1500 / sing()빅뱅-거짓말 }
 */

class Papa extends Object{  
	int money = 10000;     
	public Papa() { super(); }
	public void sing() {  System.out.println("GOD-거짓말");  }
}// end class

class Son extends Papa{ 
	int money = 1500;
	public Son() { super(); }
	@Override public void sing() { System.out.println("빅뱅-거짓말"); }
//	GOD 거짓말 < super.sing() >
//	@Override public void sing() { super.sing(); System.out.println("빅뱅-거짓말"); }
} // end class

public class Coffee018 {
	public static void main(String[] args) {
//		1. 다음 코드를 확인하고 예상되는 출력결과를 적으시오.
		Papa mypapa = new Son();
		//Papa mypapa { money=10000 /sing(GOD) }					mypapa 출력
		//new Son() - { money=1500  /sing(빅뱅) } - { money=10000 /sing(빅뱅) } @Override
		System.out.println(mypapa.money); //10000
		mypapa.sing(); //빅뱅-거짓말
//		2. Son클래스의 1500이 출력되게 코드를 작성하시오.
		System.out.println(( (Son)mypapa).money); //1050
	}
}

/*
class Papa extends Object{  
	int money = 10000;     
	public Papa() { super(); }
	public void sing() {  System.out.println("GOD-거짓말");  }
	}// end class
		
class Son2 extends Papa{ 
	int money = 1500;
	public Son2() { super(); }
	@Override public void sing() { super.sing(); System.out.println("빅뱅-거짓말"); }
	} // end class
		
public class Repeat007_1 {
	public static void main(String[] args) {
		Papa mypapa = new Son2();   
		System.out.println(mypapa.money);      
		mypapa.sing();      
		// 1500 출력되게 해주세요.
	}
}
*/