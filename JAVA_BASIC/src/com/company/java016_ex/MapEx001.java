package com.company.java016_ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

/*
	MAP 만들기
	KEY   VALUE
	피구왕   통키
	---------------------
	제빵왕   김탁구
	---------------------
	요리왕   비룡
	
	Map<String, String> map = new HashMap<>();
	
	2 다음과 같이 문제풀기
	==============================
	KING   NAME
	==============================
	피구왕   통키
	---------------------
	제빵왕   김탁구
	---------------------
	요리왕   비룡
	---------------------
	KING의 정보를 제공중입니다
	이름을 입력하세요> 제빵왕
	
	ㅁ제빵왕 : 김탁구
 */

public class MapEx001 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("피구왕", "통키");
		map.put("제빵왕", "김탁구");
		map.put("요리왕", "비룡");
		
		System.out.println("=====================\n"
				+ "KING\tNAME\n"
				+ "=====================");
		
//		System.out.println(map.size());
		
		//iter - ver2
			//1. key 모으기 2. 처리대상확인 haeNext 3.값꺼내오기 next
		Iterator <Entry <String, String>> iter = map.entrySet().iterator();
		while(iter.hasNext()) { //###2
			Entry <String, String> temp = iter.next(); //###3
			System.out.println(temp.getKey() + "\t" + temp.getValue());
		} System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("KING의 정보를 제공중입니다.\n이름을 입력하세요 > "); String name = sc.next();
		String result = "왕의 정보를 확인해주세요";
		if(map.containsKey(name)) { result = "□ " + name + " : " + map.get(name); }
		System.out.println(result);
		
		//iter - ver2
		//											 key val  key val
		//1. Entry 모으기 2. 처리대상확인 3.값꺼내오기		[one=하나, two =둘]
		//향for str = equals 어쩌고로 검사하고 맞는 값 출력
	}
}
