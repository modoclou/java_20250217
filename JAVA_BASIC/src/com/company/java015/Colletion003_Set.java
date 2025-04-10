package com.company.java015;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

//1. 콜렉션프레임워크 - [배열]의 단점을 개선한 [객체]만 저장가능 (동적배열)
//2. List, Set, Map
//	 List - index O, 중복허용 O, add/get(번호)/size/remove/contains
//	 Set  - index X, 중복허용 X, add/향상for, Iterator/size/remove/contains

public class Colletion003_Set {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("one");
		list.add("two");
		list.add(new String ("three")); //객체 방식으로 데이터 넣기
		System.out.println(list.size() + " / " + list); //4
		
		Set<String> set = new HashSet<>(); //주머니: index X, 중복적용 X
		set.add("one");
		set.add("one");
		set.add("two");
		set.add(new String ("three")); //객체 방식으로 데이터 넣기
		System.out.println(set.size() + " / " + set); //3
		
		//add, get X, size, remove, contains
		
//		Set<int> set2 = new HashSet<>(); Syntax error, insert "Dimensions" to complete ReferenceType
		Set<Integer> set2 = new HashSet<>(); //int 숫자자료형, 객체만저장 -> int의 객체형식인 Integer로 입력
		//int → integer, float → Float, double → Double... ▷ Wrapper Class
		set2.add(1); // Integer e = 1;
		set2.add(new Integer(2)); // Integer e = new Integer(2);
		set2.add(3); //Integer e = 1;
		
		int 	a = 1; //값	 기초값 (primitive type)
		Integer e = 1; //부품객체 Wrapper - boxed - 객체화 - 부품객체(로만든다)
		System.out.println(a + " / " + e);	//1/1
		System.out.println(/*a.byteValue +*/ " / " + e.byteValue());
		//1) 부품객체(클래스) = 기초값	boxed
		//2) 클래스가 만들어놓은 기능들 사용가능
		//3) Intefet.parseInt, double.parseDouble, String.valueOf
		
		// for + size - get
		System.out.println("get " + set2.getClass());			//e.byteValue
		for(Integer e1 :  set2) { System.out.println(e); }
		System.out.println("1. add 2. size");
		System.out.println("3. remove - " + set2.remove(2));
		System.out.println("4. contains =  " + set2.remove(2));
		System.out.println(set2);
		
		// for + size - get > System.our.println("get" + set2.get(번호);
		Iterator <Integer> iter = set2.iterator(); //1. 줄서라 [1, 3]
		while(iter.hasNext()) {//2. 처리대상확인 iter[→1,3]}
			System.out.println(iter.next()); //3. 꺼내오기
			//1 집어넣어도 객체로만 인식
		}
	}
}