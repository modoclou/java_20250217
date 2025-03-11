package com.company.java015_ex;

class Sawon005{
	// (1) 인스턴스변수 - heap - new O(와 관련 있다는 뜻은 실체화) - this 각각
	int pay=10000;
	// (2) 클래스변수 - method - new X - 공용
	static int su=10;
	// (3) 클래스(static)변수 - 인스턴스사용불가
	//###000: 클래스변수=인스턴스변수
//	static int basicpay=pay;
	// (4) 클래스 변수 - method - new X - 인스턴스사용불가
	static int basicpay2;
	static { basicpay2=20000; }
	
	// (5) 클래스 메서드 - method - new X - 공유 - 출력 시 Sawon005.showSu();
	public static void ShowSu() { System.out.println(su); } //###001: 클래스함수 - method - new 사용불가 - 공유
	//public static void ShowPay() { System.out.println(this.pay); } //###001: pay가 사용가능(static)한 상태가 아니기 때문에

	// (6) 인스턴스 메서드 - heap - new O - this 각각
	public static void showAll001(){
		System.out.println(su);
		System.out.println(this.pay);
	}

	// (7) 클래스(static)변수 - 인스턴스사용불가
	public static void showAll002() {
	    showAll001();     
	    System.out.println(this.pay); 
	} 
} 

public class Coffee014 {
	public static void main(String[] args) {
		Sawon005 sa = new Sawon005();
		sa.showAll001();
	}
}

/*
package java027_part002_정리문제;

class Sawon005{  
   int pay      =10000;      
   static int su=10;   
   static int basicpay=pay;  
    
   static int basicpay2;
   static {  basicpay2=20000; }
 
   public static void showSu() {   System.out.println(su);  }         

   public  void  showAll001() {   
       System.out.println(su);
       System.out.println(this.pay);
   }

   public static  void  showAll002() {
       showAll001();     
       System.out.println(this.pay); 
   } 
} 
public class Repeat003_ {
  public static void main(String[] args) {
   Sawon005  sola = new Sawon005();  
   sola.showAll001();
  }
}

/* 이론
8.  static
   1. jvm이    method area  에 1번만 메모리를 올림
   2. 클래스명.변수명, 클래스명.메서드명
   3. 예시)
    가. 클래스변수        나. method area  다. new X  공용   라. A.company
     class A{ static String company; }
*/
