package com.company.java013;

//1. 클래스는 부푸맥체  (상태-멤버변수 와 행위-멤버함수}
//                 클래스뱐수. 인스턴스뱐수, 지역변수 / 클래스메서드, 인스턴스메서드
// 변수 초기화 단계
//                    	기본값       명시적초기돠		초기화블록		생성자
//     classValue		1) 0	2) 20		3) 20 		4)X
//     instanceValue    5) 0	6) 1		7) 10		8)10

class MemberCall002{
	int instanceValue=10; //인스턴스변수, heap area, new O, this
	static int classValue=20; //클래스변수, method area, new x, 공유, 클래스명.변수명
	
	int instanceValue2= classValue; //인스턴스변수(5) = 클래스변수(1)
//	static int classValue2=instanceValue; //#1 erorr - static은 인스턴스 사용 불가(먼저 올라가기 때문에)
	// static jvm 로딩시 메모리 할당받음(바로사용), instance는 new를 사용해 메모리 할당받고 객체생성후 사용
	///Cannot make a static reference to the non-static field instanceValue
} //1)라인A

static void staticMethod2() { //#2 erorr - static은 인스턴스 사용 불가(먼저 올라가기 때문에)
	System.out.println(classValue);
	//System.out.println(instanceValue); ///Cannot make a static reference to the non-static field instanceValue
} //2)라인B

void instanceMethod2() {
	System.out.println(classValue);
	System.out.println(instanceValue); //3)라인C
}

/*static void staticMethod2(){ //#4 erorr - static은 인스턴스 사용 불가(먼저 올라가기 때문에)
	System.out.println(classValue);
	instanceMethod1(); //4)라인D
	//Cannot make a static reference to the non-static method instanceMethod1() from the type MemberCall001
}*/

void instanceMethod3() { //#2 인스턴스 메서드 - heap area - new O - this 각각 (static 사용가능)
	staticMethod2(); //5)라인E
} //end class

///컴파일 에러가 발생하는 라인? 	A. A,B,D라인
///그 이유는?
///A.
///A라인: 
///B라인: 
///D라인: static을 붙이면 해결

