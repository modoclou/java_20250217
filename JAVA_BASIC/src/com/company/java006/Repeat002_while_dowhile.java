package com.company.java006;

public class Repeat002_while_dowhile {
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 7efdcda83772e6541eb8f6835f99453a3a9fa1ff
	public static void main(String[] args) {
		//1. for  ( 반복횟수를 알때 ) 
		//   1   2   3   {반복}  {변수} for(시작; 종료; 변화)
		for(int i=1; i<=3;i++) { System.out.print( i + "\t");  }       System.out.println();
		
		//2. while (반복횟수를 모를때 - 게시판 )  while  초기값위, 증감맨끝
	    int i=1; 	while(i<=3) { System.out.print( i + "\t");  i++;}  System.out.println();
		
		//3. do while (무조건 1번은 실행해야할 때)  while  위치를 맨끝
	    i=1; 	do{ System.out.print( i + "\t");  i++;}while(i<=3);    System.out.println();
		
	}// end main
}// end class
<<<<<<< HEAD
=======
	public static void main(String [] args) {
		//1. for(반복횟수를 알 때)
		//     1  2  3 [반복] [변수] for(시작; 종료; 변화;}
		for(int i=1; i<=3; i++){ System.out.print( i + "\t"); }	System.out.println();
		
		//2. while (반복 횟수를 모를 때 - 게시판) while 초기값 위, 증감 맨끝
		int i=1; while(i<=3){ System.out.print( i + "\t"); i++;}	System.out.println();
				
		//3. do while (무조건 1번은 실행해야 할 때)
		i=1; do{ System.out.print( i + "\t"); i++;}while(i<=3);	System.out.println();
	}
}
>>>>>>> origin/2
=======
>>>>>>> 7efdcda83772e6541eb8f6835f99453a3a9fa1ff
