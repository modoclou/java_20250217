package part001;

/**
	함수(5) :  
	메서드오버로딩이과 오버라이딩이란? 
 **/

public class SelfTest022 {
	public static void main(String[] args) {
		///메서드오버로딩
		///메소드의 이름이 같고 매개 변수의 개수나 타입이 다르다.
		class Methodoverlading {
		    int add(int a, int b) {
		        return a + b; //호출받고, add가 실행되어 계산한 값을 main으로 돌려준다
		    }    
		    int add(int a, int b, int c) {
		        return a + b + c;
		    }
		}
		///오버라이딩
		///부모 클래스와 똑같은 메서드를 자식 클래스에서 내용만 바꾸는 것
		class Animal {
		    void pick() { System.out.println("고양이"); } }
		
		class Pet extends Animal { //부모 메서드 덮어쓰기
		    @Override void pick() { System.out.println("개"); } }
		
		public class Test {
		    public static void main(String[] args) {
		        Animal my = new Pet();
		        my.pick();  // 개
		    }
		}
	}
}
