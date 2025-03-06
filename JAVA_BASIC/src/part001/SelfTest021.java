package part001;

/**
	함수(4) : 메서드오버로딩
	1. 다음의 결과가 나오게 메서드를 구현하시오		    
	print(3,5);			결과값 :   8 출력
	print(1.2,3.4);		결과값 :   4.6출력 
 **/

public static void print(double a, double b) { System.out.println(a+b); }

public class SelfTest021 {
	public static void main(String[] args) {
		print(3,5);			//결과값 :   8 출력
		print(1.2,3.4);		//결과값 :   4.6출력 
	}
}
