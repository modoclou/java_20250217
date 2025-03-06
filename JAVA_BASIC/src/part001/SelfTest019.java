package part001;

/**
	 함수(2) : 파라미터
	   1. hap(3,5) 함수를 정의하시오 :  접근(어디에서나) , 클래스멤버, 리턴값 void, 파라미터 두개의 숫자를 입력받아줌
	   2. 기능 : 두 수를 더한값을 출력해줌.
	   3. hap(3,5);	  결과값 :   두수의 합 : 8 
 **/

class Hap{
	int hap=0;
	void hap(int a, int b){
		hap = a + b;
	}
}
public class SelfTest019 {
	public static void main(String[] args) {
		Hap h = new Hap();
		h.hap(3,5);
		System.out.println("두 수의 합: " + h.hap);
	}
}
