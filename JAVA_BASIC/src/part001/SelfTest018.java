package part001;
/**
	함수(1) : 함수의 구조	
   	1. cat() 함수 정의하시오 : 접근(어디에서나) , 클래스멤버, 리턴값 void, 파라미터 없음
   	2. cat() 실행시 야옹출력 
 **/

class Cat{
	void show() {
		System.out.println("야용");
	}
}

public class SelfTest018 {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.show();
	}
}
