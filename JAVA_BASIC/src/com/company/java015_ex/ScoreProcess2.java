package com.company.java015_ex;

public class ScoreProcess2 {
	public ScoreProcess2() { super(); }
	public void process_avg(Score2[] std) {
		 for(Score2  s :  std) { s.setAvg(  (s.getKor()+s.getEng()+s.getMath() )/3.0); }
	}

	public void process_pass(Score2[] std) {
		 for(Score2 s: std) {
			 s.setPass(  s.getAvg() <60 ? "불합격"  : s.getKor()<40 || s.getEng()<40 || s.getMath()<40? "재시험":"합격" );
		 }
	}
}