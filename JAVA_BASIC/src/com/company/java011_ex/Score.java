package com.company.java011_ex;

public class Score{
private String name;
	private int kor, eng, math , total;
	private double aver;
	private String p  , s  , rank;
	
	public Score(String name, int kor, int eng, int math) {
		this(); //Score();
		//1. new 메모리, 객체생성  2.Score() 초기화  3.a1번지
		//객체 생성이 이루어지고 난 다음에 세팅
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math; //사용자들에게 입력받은 다음에 셋팅
//		1-2. this(); //error Score();
	}
	@Override public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", total=" + total
				+ ", aver=" + aver + ", p=" + p + ", s=" + s + ", rank=" + rank + "]";
	}
	public Score() {
		this.p = this.s = this.rank = " ";
	}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getKor() {return kor;}
	public void setKor(int kor) {this.kor = kor;}
	public int getEng() {return eng;}
	public void setEng(int eng) {this.eng = eng;}
	public int getMath() {return math;}
	public void setMath(int math) {this.math = math;}
	public int getTotal() {return total;}
	public void setTotal(int total) {this.total = total;}
	public double getAver() {return aver;}
	public void setAver(double aver) {this.aver = aver;}
	public String getP() {return p;}
	public void setP(String p) {this.p = p;}
	public String getS() {return s;}
	public void setS(String s) {this.s = s;}
	public String getRank() {return rank;}
	public void setRank(String rank) {this.rank = rank;}
	public static void info() {
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\r\n"
				+ "이름\t국어\t영어\t수학\t총점\t평균\t합격여부\t장학생\t랭킹\r\n"
				+ ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	}
	public void show() { 
		this.total = this.kor + this.eng + this.math;
		this.aver = this.total/3.0;
		if(this.aver>=60) {this.p = "합격";} //this.p = this.aver<60? "불합격":"합격";
		else {this.p="불합격";}
		if(this.aver>=90) {this.s = "장학생";} //this.s - this.aver>=95?"장학생":"";
		else {this.s="탈락";}
		for(int i=0; i<(int)this.aver/10; i++) { this.rank += "*";  } //int 정수형으로 변환하면 85/10=8, 92/10=9
//		System.out.println(toString());
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%s\t%s\t%s\n", this.name, this.kor, this.eng, this.math, this.total, this.aver, this.p, this.s, this.rank);
	}
} // java011_ex에 설정해주세요!
