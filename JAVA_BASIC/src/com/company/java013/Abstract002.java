package com.company.java013;

/*
			  Shape { showArea(int w, int h); showArea(int r) }
		 ↑		↑		↑
	Rectangle Circle  Triangle
 */

/**
 □ 사각형의 넓이 : 100 
 □ 삼각형의 넓이 : 50 
 □ 원의 넓이 : 314.1592653589793 
 **/

abstract class Shape{
	abstract void showArea(int w, int h);
	abstract void showArea(int r);			//설계 메서드
}

class Rectangle extends Shape{
	@Override void showArea(int w, int h) { System.out.println("□ 사각형의 넓이 : " + w*h); }
	@Override void showArea(int r) {	} //불필요한 Override
}

class Triangle extends Shape{
	@Override void showArea(int w, int h) {	System.out.println("□ 삼각형의 넓이 : " + w*h*0.5); }
	@Override void showArea(int r) {	} //불필요한 Override
}

class Circle extends Shape{
	@Override void showArea(int w, int h) {	System.out.println("□ 원의 넓이 : " + w*h*Math.PI); }
	@Override void showArea(int r) {	} //불필요한 Override
}

public class Abstract002 {
	public static void main(String[] args) {
		///ver-1	부모 = 자식
		Shape shape = null;		//shape = new Shape; error
		
		shape = new Rectangle();
		shape.showArea(10, 10);
//		Rectangle rec = new Rectangle();
//		rec.showArea(10, 10);					///가로*세로
		
		shape = new Triangle();
		shape.showArea(10, 10);
//		Triangle tri= new Triangle();
//		tri.showArea(10, 10);					///(가로*세로)/2
		
		shape = new Circle();
		shape.showArea(10, 10);
//		Circle cir = new Circle();
//		cir.showArea(10, 10);						///반지름*반지름*ㅠ값
		
		///ver-2
		Shape shape2 = null;
		Shape []s	 = {new Rectangle(), new Triangle(), new Circle()};
		//Circle이니?		shape.showArea(10);
		//instanceof - 객체가 어떤 클래스인지 어떤 클래스를 상속받았는지 확인
		if( s[0] instanceof Circle ) { s[0].showArea(10); }
		else { s[0].showArea(10, 3); }
		
		if( s[1] instanceof Circle ) { s[0].showArea(10); }
		else { s[1].showArea(10, 3); }
		
		if( s[2] instanceof Circle ) { s[0].showArea(10); }
		else { s[2].showArea(10, 3); }
	}
}