package com.company.dto;

public class UserDto {	//데이터 주고받으므로 Component 쓰지 않음
	private int no;
	private String name;
	private int age;
	
	//생성자, toString, getters/setters
	
	public UserDto() { super(); }
	public UserDto(int no, String name, int age) { super(); this.no = no; this.name = name; this.age = age; }

	@Override public String toString() { return "UserDto [no=" + no + ", name=" + name + ", age=" + age + "]"; }

	public int getNo() { return no; }
	public void setNo(int no) { this.no = no; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; } 
}
