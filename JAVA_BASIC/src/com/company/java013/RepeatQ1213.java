package com.company.java013;

/**
 Q.12~13. 다음의 결과가 나오도록 코드를 작성하시오.
	 출력된화면
	 A [name=null]
	 A [name=null]
	 A [name=null]
 **/

class A{
	private String name;

	public A() { super(); } //superclass
	public A(String name) { super(); this.name = name;} //field

	//getters/setters
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	//toString
	@Override public String toString() { return "A [name=" + name + "]"; }
}

class TestArr{}

public class RepeatQ1213 {
	public static void main(String[] args) {
		A [] arr = new A[3]; //arr [null, null, null]
		arr[0] = new A();
		arr[1] = new A();
		arr[2] = new A();
		//주의사항!) 생성자를 호출해 인스턴스변수를 사용가능하게 만들어야 함.
//		for(int i=0; i<arr.length; i++) { System.out.println(arr[i]); }
		for(A a : arr ) { System.out.println(a); }
	}
}
