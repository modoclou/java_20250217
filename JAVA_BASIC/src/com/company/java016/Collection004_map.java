package com.company.java016;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/*
	List : ##5.   기차  	인덱스여부 [O] ,  중복허용여부 [O] ,  	[add/get(index구분)/size/remove/contains] 
	Set  : ##6.   주머니	인덱스여부 [X] ,  중복허용여부 [X] ,  	[add/get(X)향for, Iterator/size/remove/contains] 
	Map  : ##7.   사전	[ 키 : 값 ] - 쌍(Entry),        	[add(X) put/get(X) key/size/remove/contains] 
 */

public class Collection004_map {
	public static void main(String[] args) {
		//     key, value - add (X) put, get, size, remove, contains
		Map<String, String> map = new HashMap<>();
		map.put("one", "하나");
		map.put("two", "둘");
//		map.put("one", "셋"); 키값이 같으면 덮어씀
		map.put("three", "셋");
		
		System.out.println(map);
		System.out.println(map.get("one"));			//2. 가져오기 맵아 key줄게 value다오
		System.out.println(map.size());				//3. 갯수
		System.out.println(map.remove("three")); 	//4. 삭제 key Object(객체) 값을 넣어야 함
		System.out.println(map.containsKey("one"));
		System.out.println(map.containsValue("둘"));	//true
		System.out.println(map.keySet());			//키들 모으기 [one, two] 키들을 모아주세요!
		System.out.println(map.values());			//값들 모으기
		System.out.println(map.entrySet());			//[one=하나, two=둘]
		//								    Set <Entry <String, String>> 
		
		//출력 향for ex
		for( Entry <String, String> e : map.entrySet() ) {
			System.out.println(e.getKey() + "/" + e.getValue());
		}
		
		//iter - ver1
		//1. key 모으기 2. 처리대상확인 haeNext 3.값꺼내오기 next
		Iterator <String> iter = map.keySet().iterator(); //iter→ [one, two]
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.println(key + "/" + map.get(key));
		} System.out.println();
			
		//iter - ver2
		//											 key val  key val
		//1. Entry 모으기 2. 처리대상확인 3.값꺼내오기		[one=하나, two =둘]
		Iterator <Entry <String, String>> eiter = map.entrySet().iterator();
		//iter → [one=하나, two =둘]
		while(eiter.hasNext()) { //2. 처리대상확인 hasNext
			Entry <String, String> temp = eiter.next(); //3. 값꺼내오기 next
			System.out.println(temp.getKey() + "/" + temp.getValue());
		}
	}
}
