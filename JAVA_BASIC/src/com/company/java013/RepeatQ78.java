package com.company.java013;

//Q8. DTO
//8-1. private(클래스내부)			- getters/setters
//8-2. 객체의 상태를 표현하는 출력		- toString(전체초기화)

/**
 Q7. 접근제어자 사용범위를 작은 순서에서 큰 순서로 적기
 
 Q8. 다음 Car4는 DTO목적이다.
  8-1. color 접근제어자가 private이므로 ( # / # ) 를 작성해 데이터를 셋팅하고, 데이터를 가져오고
  8-2. System.out.println(컬러객체명) 시
  	   Car4[color=red]게 출력되게 만들려면 ( # ) 메서드가 필요함. 
**/

class Car4 extends Object{
	private String color; //private 수정X
	public String getColor() { return color; }
	public void setColor(String color) { this.color = color; }
	
	public Car4() { super(); }
	@Override public String toString() { return "Car4 [color=" + color + "]"; }
}

public class RepeatQ78 {
	public static void main(String[] args) {
		Car4 c1 = new Car4();
		c1.setColor("red");
		System.out.println(c1); //Car4[color=red]
	} //end main
} //end class

///Q9.  color오류					- getters/setters 사용하고 setColor로 바꾸면 해결
///Q10. 클래스를 상속하는 이유		- 답
///Q11. 상속의 형식				- 답
