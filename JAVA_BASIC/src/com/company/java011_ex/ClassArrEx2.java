package com.company.java011_ex;

import com.company.java011_ex.Score2; // 방법1.
import com.company.java011_ex.*; //방법2. '*' 모든 클래스들을 다 불러옴
//import com.company.java011_ex.Score2Print;
//import com.company.java011_ex.Score2Process;

/**
ㅁ출력된 화면
:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\r\n
이름/t국어/t영어/t수학/t평균/t합격여부
:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
아이언맨   100   100   100   100.0   합격
헐크   90   60   80   76.0   합격
블랙팬서   20   60   90   56.0   불합격
 **/

public class ClassArrEx2 {
	public static void main(String[] args) {
	////// MODEL
	Score2[] std = new Score2[3];  //std [null, null, null]
	std[0] = new Score2("아이언맨", 100, 100, 100);
	std[1] = new Score2("헐크", 90, 60, 80);
	std[2] = new Score2("블랙펜서", 20, 60, 90);
	// 0번째에는 아이언맨 정보넣기  - "아이언맨", 100, 100, 100
	// 1번째에는 아이언맨 정보넣기  - "헐크", 90, 60, 80
	// 2번째에는 아이언맨 정보넣기  - "블랙팬서", 20, 60, 90
	  
	////// CONTROLLER - 처리 해결사 Controller)
	//리턴값  메서드명(파라미터){해야할 일}
	System.out.println("main 주소확인: " + System.identityHashCode(std) );
	Score2Process process = new Score2Process();
	process.process_avg(std); // void	process_avg()(Score2[] std){ 평균구하기 }
	process.process_pass(std); // void	process_pass()(Score2[] std){ 합격여부구하기 }  
   
	////// VIEW       - CONSOLE , WEB
	Score2Print  print = new Score2Print();
	print.show(std);  // void	process_avg()(Score2[] std){ 출력하기 }
  }
} 
