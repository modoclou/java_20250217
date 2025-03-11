package com.company.java016;
/*
	Q1.   다음 빈칸을 채우시오
		1. 콜렉션프레임워크
		- [    Array 배열   ]의 단점을 개선한 클래스 [  객체  ]만 저장가능   ( 동적배열 )
		- 저장공간의 크기를 [##3.  동적    ]으로 관리함.
	
	2. 핵심 인터페이스 [ 3개: List, Set, Map  ]
		- 인터페이스를 통해서 틀이 잡혀 있는 방법으로 
		  다양한 컬렉션 클래스를 이용함.
	
	  List : ##5.   기차     인덱스여부 [O] ,  중복허용여부 [O] ,  	[add/get(index구분)/size/remove/contains] 
	  Set  : ##6.   주머니   	인덱스여부 [X] ,  중복허용여부 [X] ,  	[add/get(X)향for, Iterator/size/remove/contains] 
	  Map  : ##7.   사전     [ 키 : 값 ] - 쌍(Entry),        	[add(X) put/get(X) key/size/remove/contains] 
	
	Q2.  ArrayList, HashSet 을 작성하시오.
		1. UserInfo    Dto 클래스만들기    - 속성 :  private  String name; private  int age;
		2. users ArrayList 만들기
		3. 다음의 데이터 넣기
		   new UserInfo("아이언맨" , 50) , new UserInfo("헐크" , 40) , new UserInfo("캡틴" , 120)
		4. for+size / 향상된 for 이용해서 데이터 출력
	 
	
		5. sets  HashSet 만들기
		6. 다음의 데이터 넣기
		   new UserInfo("아이언맨" , 50) , new UserInfo("헐크" , 40) , new UserInfo("캡틴" , 120)
		7. for+size / 향상된 for 이용해서 데이터 출력
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

class UserInfo3{
	private String name;
	private int age;
	
	public UserInfo3() { super(); }
	public UserInfo3(String name, int age) { super(); this.name = name; this.age = age; }
	
	@Override public String toString() { return "UserInfo3 [name=" + name + ", age=" + age + "]"; }
		public String getName() { return name; }
		public void setName(String name) { this.name = name; }
		public int getAge() { return age; }
		public void setAge(int age) { this.age = age; }
		
	@Override public int hashCode() { return Objects.hash(age, name); }
	@Override public boolean equals(Object obj) {
		if (this == obj) return true; if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		UserInfo3 other = (UserInfo3) obj;
		return age == other.age && Objects.equals(name, other.name); }	
}

public class RepeatMorning001 {
	public static void main(String[] args) {		
	List<UserInfo3> users = new ArrayList<>();
	users.add(new UserInfo3("아이언맨" , 50));
	users.add(new UserInfo3("헐크" , 40));
	users.add(new UserInfo3("캡틴" , 120));
	
//	for(int i=0; i<users.size(); i++) {
//		UserInfo3 temp = users.get(i); //0,1,2
//		System.out.println(temp.getName() + "/" + temp.getAge());
//		} System.out.println();
		
//	for(UserInfo3 temp : users) {
//		System.out.println(temp.getName() + "/" + temp.getAge());
//	} System.out.println();
	
	for(int i=0; i<users.size(); i++) {
		UserInfo3 temp = users.get(i); //0,1,2
			System.out.println(temp.getName() + "/" + temp.getAge());
		} System.out.println();
		
	HashSet<UserInfo3> users2 = new HashSet<>();
	users2.add(new UserInfo3("아이언맨" , 50));
	users2.add(new UserInfo3("헐크" , 40));
	users2.add(new UserInfo3("캡틴" , 120));
	
	for(UserInfo3 us : users2) { System.out.println(us.getName() + "/" + us.getAge()); }
	System.out.println();
	
	//1. sets 모으기 - iterator / 2. 처리대상확인 hasNext / 3. 꺼내오기 next
	Iterator <UserInfo3> iter=  users.iterator(); //sets를 iter라는 변수에 담는다
		while(iter.hasNext()) { //처리대상확인
			UserInfo3 us = iter.next(); //꺼내오기
			System.out.println(us.getName() + "/" + us.getAge());
		}
	}
}
