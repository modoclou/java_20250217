package com.company.java017;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambda004_api {
	public static void main(String[] args) {
		//#1. 	Consumer<T> 받는 용도 - accept
		//		void java.util.function.Consumer.accept ( T t )
		//		()->{}	파라미터 있음O / 리턴값 없음(void) X
//		Consumer<String> consumer = (t)->{ System.out.println("Hello =(: ) )╣" + t);};
//		Consumer<String> consumer = t -> System.out.println("Hello =(: ) )╣ " + t);
		Consumer<String> consumer = t -> System.out.println("\t ╮\nHello =(: ) )╣ \n\t ╯\t" + t);
//		Consumer<String> consumer = System.out::println;
		
		consumer.accept("sally");
		consumer.accept("alpha");
		
		
		//#2	Supplier	- 제공용도		- get
		//		T java.util.function.Supplier.get ()
		//		()->{}	파라미터 없음X / 리턴값 있음 O
		Supplier<String> supplier = ()->{ return "Ladys and Fellows"; };	//##채우기
		System.out.println(supplier.get()); 	//Hello
		
		
		//#3	Predicate	- 판단용도		- test
		//1. 메서드찾기
		//		boolean java.util.function.Predicate.test ( T t )
		//2.	(t)->{ return }		파라미터 있음 O / 리턴값 있음 O
//		Predicate<Integer> predicate = (t) -> { return t<0; }; //##3. 음수인지 양수인지 판단
		Predicate<Integer> predicate = t -> t<0; 
		System.out.println( predicate.test(-1));
		System.out.println( predicate.test(1));
		
		//#4	Function	- 처리용도		- apply
		//1. 메서드찾기
		//		R java.util.function.Function.apply ( T t )
		//2.	(t)->{ return }		파라미터(T) 있음 O / 리턴값 있음 O
//		Function<String, Integer> function = (t) -> { return Integer.parseInt(t); };
//		Function<String, Integer> function = t -> Integer.parseInt(t);
		Function<String, Integer> function = Integer::parseInt;
		System.out.println(function.apply("10") + 3);	//13	문자열을 숫자 Integer.parseInt();
		
		//#5	Operator	- 연산용도		- apply
		//1. 메서드찾기
		//		int java.util.function.IntBinaryOperator.applyAsInt ( int left, int right )
		//2.	(t)->{ return }		파라미터(int left, int right) 있음 O / 리턴값 있음 O
//		IntBinaryOperator	opreator = (left, right) -> { return left>=right? left:right; };
		IntBinaryOperator	opreator = (left, right) -> left>=right? left:right;
		System.out.println(opreator.applyAsInt(10, 3));	//10 큰값리턴
	}
}

/*
	2. 자바 api의 함수형 인터페이스
	 1. Consumer 	- 받는 용도 	- accept
	 2. Supplier 	- 제공용도 	- get
	 3. Predicate	- 판단용도 	- test
	 4. Function 	- 처리용도 	- apply
	 5. Operator 	- 연산용도 	- apply
 */