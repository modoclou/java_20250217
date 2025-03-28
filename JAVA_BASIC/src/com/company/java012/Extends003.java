package com.company.java012;

//1. 클래스는 부품객체
//2. 상태(멤버변수)와 행위(멤버함수)
//3. 상속 - 클래스의 재사용(재활용)

/*
	Object
	  ↑
	MobileNote7   String iris(private)                        MobileNote7(){#3     }#4
				  void newshow(){} , getter/setter
	  ↑
	MobileNote8   String face(private)                        MobileNote8(){#2     }#5
				  void newshow(){} , getter/setter
	  ↑
	MobileNote9   int battery(private)                        MobileNote9(){#1     }#6
				  void newshow(){} , getter/setter
 */

class MobileNote7 extends Object{
	private String iris;
	public String getIris() { return iris; }
	public void setIris(String iris) { this.iris = iris; }
	
	void newshow() { System.out.print(":::: NOTE7 = 홍채인식 > " + this.iris); }
	//public > protected > package(#) > private ← 붙이면 오류 난다
}
class MobileNote8 extends MobileNote7{
	private String face;	
	public String getFace() { return face; }
	public void setFace(String face) { this.face = face; }
	
	@Override protected void newshow() {
		super.newshow(); //MobileNote7의 newshow()
		System.out.print("\n:::: NOTE8 = 안면인식 > " + this.face); }	
}
class MobileNote9 extends MobileNote8{
	private int battery=24; //기본값 → 명시적 → 초기화블록 → 생성자
	public int getBattery() { return battery; }
	public void setBattery(int battery) { this.battery = battery; }
//	public void setFace(String string) { }
	
//	@Override void newshow1() {	MobileNote9 must override or implement a supertype method
	@Override public void newshow() {	
		super.newshow(); //MobileNote8의 newshow()
		System.out.print("\n:::: NOTE9 = 하루 종일 배터리 사용 가능 > " + this.battery); }	
}


public class Extends003 {
	public static void main(String[] args) {
		MobileNote9 my9 = new MobileNote9();
		my9.setIris("brown");
		my9.setFace("pretty");
		my9.newshow();
	}
}
