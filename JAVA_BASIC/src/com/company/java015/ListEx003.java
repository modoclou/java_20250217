package com.company.java015;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;

import com.company.java015_ex.UserInfo;

//class ActionLisner{
//	JFrame frame;
//
//public void view() {
//	frame  = new JFrame("BOX");
//	}
//}

/*
	1. UserInfo    Dto 클래스만들기    - 속성 :  private  String name; private  int age;
	2. users ArrayList 만들기
	3. 다음의 데이터 넣기
	   new UserInfo("아이언맨" , 50) , new UserInfo("헐크" , 40) , new UserInfo("캡틴" , 120)
	4. for+size / 향상된 for 이용해서 데이터 출력
	5. 사용자들의 이름 입력받기 - 이름을 입력받으면 해당하는  유저의 자료출력
	
	> 원하는 유저의 이름을 입력하세요    _예) 아이언맨
	"아이언맨" , 50
 */

class UserInfo{
	private String name;
	private int age;
	
	@Override public String toString() { return "UserInfo [name=" + name + ", age=" + age + "]"; }
	public UserInfo() {	super(); }
	public UserInfo(String name, int age) { super(); this.name = name; this.age = age; }
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
	
}

public class ListEx003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		ArrayList<String> users = new ArrayList<>();
		new UserInfo("아이언맨" , 50);
		new UserInfo("헐크" , 40);
		new UserInfo("캡틴" , 120);
		
//		for(UserInfo temp : users) {
//		UserInfo temp = users.get(i);
//		System.out.println(temp.getName() + "/" + temp.getAge()); //이름 나이
//		} System.out.println();
		
//		System.out.print("유저 이름을 입력해 주세요. > ");		input = next().CharAt(0);
		
//		if (users.get(0).getName().equals("아이언맨")) { users.get(0); }
//		else if (users.get(1).getName().equals("헐크")) { users.get(1); }
//		else if (users.get(2).getName().equals("캡틴")) { users.get(2); }
//		else { System.out.print("다시 입력해 주세요. > "); input = next().CharAt(0); }
		
		for(int i=0; i<users.size(); i++) {
			if(users.get(i).getName().equals(input)) {
				UserInfo temp = users.get(i);
				System.out.println(temp.getName() + "/" + temp.getAge());
				break;
			}
		}
	}
}
