package com.company.java015_ex;

public class Repeat005 {
	public static void main(String[] args) {
		Score2[] std = new Score2[3]; // std = {null, null, null}  std:  3개 객체의 주소묶음
		std[0] = new Score2("아이언맨", 100, 100, 100);  // std = {101번지, null, null}
		std[1] = new Score2("헐크", 90, 60, 80);        // std = {101번지, 102번지, null}
		std[2] = new Score2("블랙팬서", 20, 60, 90);     // std = {101번지, 102번지, 103번지}
	      
			ScoreProcess2 process = new ScoreProcess2();
			process.process_avg(std);// std = {101번지, 102번지, 103번지} - 3개 객체의 주소묶음
			process.process_pass(std);// public void process_avg(Score_ver2[] std){}
	      
		//System.out.println(Arrays.toString(std));
		ScorePrint2  print = new ScorePrint2();
		print.show(std); // std = {101번지, 102번지, 103번지} - 3개 객체의 주소묶음
		// public  void show(Score_ver2[] std) {  }
	}
}
