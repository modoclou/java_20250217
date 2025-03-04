package com.company.java011_ex;

public class  Score2{   //// 실행 main과 파일을 분리해주세요!
	private String name;   // 셋팅 setName() ,가져오기 getName()
	private int kor, eng, math;  // setKor , getKor /  setEng , getEng / setMath , getMath
	private double avg;
	private String pass;
	public Object Pass;

	//생성자(기본생성자2, 필드있는생성자3, toString4, getters/setters)
	public Score2() { super(); }
	public Score2(String name, int kor, int eng, int math) {
		this.name = name; this.kor = kor; this.eng = eng; this.math = math; }
	@Override public String toString() { return "Score2 [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", avg=" + avg + ", pass=" + pass + "]"; }

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getKor() {return kor;}
	public void setKor(int kor) {this.kor = kor;}
	public int getEng() {return eng;}
	public void setEng(int eng) {this.eng = eng;}
	public int getMath() {return math;}
	public void setMath(int math) {this.math = math;}
	public double getAvg() {return avg;}
	public void setAvg(double avg) {this.avg = avg;}
	public String getPass() {return pass;}
	public void setPass(String pass) {this.pass = pass;}
	
	public void Score() { this.pass = " "; }
	
//	public {
//		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\\r\\n\r\n"
//				+ "이름/t국어/t영어/t수학/t평균/t합격여부\r\n"
//				+ ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
//	}
	
	public void show() {
		this.avg = (this.kor + this.eng + this.math)/3.0;
		if(this.avg>=75) {this.pass = "합격";}
			else {this.pass = "불합격";}
//		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%s\t%s\t%s\n", this.name, this.kor, this.eng, this.math, this.avg, this.pass);
	}
}