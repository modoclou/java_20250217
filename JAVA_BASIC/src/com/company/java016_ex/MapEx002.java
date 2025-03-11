package com.company.java016_ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

class UserInfo4{
	private String name;
	private int score;
	
	public UserInfo4() { super(); }
	public UserInfo4(String name, int score) { super(); this.name = name; this.score = score; }
	@Override public String toString() { return "UserInfo4 [name=" + name + ", score=" + score + "]"; }
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getScore() { return score; }
	public void setScore(int score) { this.score = score; }
	
	@Override public int hashCode() { return Objects.hash(name, score); }
	@Override public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		UserInfo4 other = (UserInfo4) obj;
		return Objects.equals(name, other.name) && score == other.score;
	}
}
	
/*
	클래스명 : MapEx002
	Q1. HashMap만들기
	Q2. 아래데이터 넣기
	map.put(  1,  new UserInfo("아이언맨"    , 50) );  // 1 넣어도 Integer( 클래스, 객체 )
	map.put(  2,  new UserInfo("헐크"       , 40) );  // wrapper 클래스
	map.put(  3,  new UserInfo("캡틴"       , 120) ); // boxing
	map.put(  1,  new UserInfo("아이언맨-new", 50) ); 

	Q3. Iterator로 출력하기 - 사용자정보
 */

public class MapEx002 {
	public static void main(String[] args) {
		Map<Integer, UserInfo4> map = new HashMap<>();
		map.put(1, new UserInfo4("아이언맨", 50) );  // 1 넣어도 Integer( 클래스, 객체 )
		map.put(2, new UserInfo4("헐크", 40) );  // wrapper 클래스
		map.put(3, new UserInfo4("캡틴", 120) ); // boxing
		map.put(1, new UserInfo4("아이언맨-new", 50) );
		
//		int 	a = 1;	//기초값 	- 객체의 기능 사용 불가
//		Integer e = 1;	//객체	- 객체의 기능 사용 가능	객체 = 기초값 boxing - wrapper class
//		System.out.println(a + "/" + e.byteValue());	
		
		//향for1												   key		  map아 key줘
		for( Integer key : map.keySet() ) { System.out.println(key +"/" + map.get(key));	}
		System.out.println();
		
		//향for2
		for( Entry <Integer, UserInfo4> m : map.entrySet() ) {
			System.out.println( m.getKey() + "/" + m.getValue());
		}
		System.out.println();
		
		//keySet
		Iterator <Integer> iter2 = map.keySet().iterator(); // iter → [1, 2, 3] 1. 모으기
		while(iter2.hasNext()) { //2. 처리대상확인
			Integer key = iter2.next();
			System.out.println(key + "/" + map.get(key));
		}		
		System.out.println();
		
		//entrySet
		Iterator <Entry <Integer, UserInfo4>> iter = map.entrySet().iterator();
		while(iter.hasNext()) {
			Entry <Integer, UserInfo4> temp = iter.next(); //temp선언
			System.out.println(temp.getKey() + "/" + temp.getValue());
		}
	}
}
