package com.company.java015_ex;

public class ScorePrint2 {
	public ScorePrint2() {  } 	
	public void show_title() {
		 System.out.println("=============================================================\r\n"
		 		+ "이름\t국어\t영어\t수학\t평균\t합격여부\r\n"
		 		+ "=====================================================================================");
	}
	public  void show(Score2[] std) {  
		show_title();
		for(Score2 s :  std) {
			System.out.println(s.getName() + "\t" + s.getKor() +"\t" + s.getEng() +"\t" + s.getMath() +"\t"
					+String.format("%.2f" , s.getAvg())   + "\t" + s.getPass());
		}		
	}
}
