package com.company.java015_ex;

/*
	객체 배열의 사용법을 익혀보자
	1. Score, ScoreProcess, ScorePrint 클래스와 ClassArr004(Coffee016) 클래스는 패키지를 분리하시오.
	2. 클래스들의 옵션은 다음과 같다. 멤버필드를 private로 설정하시오.
	3. 다음과 같이 출력되도록 main을 채우시오.
	
	□ 주어진옵션(1)
	Score[] std = new Score[3];
	std[0] = new Score("아이언맨", 100, 100, 100);
	std[1] = new Score("헐크", 80, 60, 80);
	std[2] = new Score("블랙팬서", 20, 60, 90);
 */

class Score3{
	private String name;
	private int kor, eng, math, total;
	private double avg;
	private String pass;
	
	public Score3() { super(); }
	public Score3(String name, int kor, int eng, int math) { super(); this.name = name; this.kor = kor; this.eng = eng; this.math = math; }
	@Override public String toString() {
		return "Score3 [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", total=" + total
				+ ", avg=" + avg + ", pass=" + pass + "]";
	}
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getKor() { return kor; }
	public void setKor(int kor) { this.kor = kor; }
	public int getEng() { return eng; }
	public void setEng(int eng) { this.eng = eng; }
	public int getMath() { return math; }
	public void setMath(int math) { this.math = math; }
	public int getTotal() { return total; }
	public void setTotal(int total) { this.total = total; }
	public double getAvg() { return avg; }
	public void setAvg(double avg) { this.avg = avg; }
	public String getPass() { return pass; }
	public void setPass(String pass) { this.pass = pass; }
	
}

class ScoreProcess{
	
}

class ScorePrint{
	void show() {
		System.out.println("뭔가적음...겁나많이");
	};
}

public class Coffee016 {
	public static void main(String[] args) {
		Score3[] std = new Score3[3];
		std[0] = new Score3("아이언맨", 100, 100, 100);
		std[1] = new Score3("헐크", 80, 60, 80);
		std[2] = new Score3("블랙팬서", 20, 60, 90);
		
		ScoreProcess2 process = new Scoreprocess();
		process.process_avg(std);
		process.process_pass(std);
		
		ScorePrint2 print = new ScorePrint2();
		print.show(std);
	}
}
