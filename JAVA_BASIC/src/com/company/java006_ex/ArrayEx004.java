package com.company.java006_ex;

public class ArrayEx004 {
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 7efdcda83772e6541eb8f6835f99453a3a9fa1ff
	public static void main(String[] args) {
	   char[] ch= {'B' , 'a' , 'n' , 'a', 'n' , 'a'};
	   int cnt=0;
	   //ver-0    ch 배열에서 a의 갯수 세기
	   //ver-1    'B'  소문자'a'라면 갯수세기
	   //ver-1    'a'  소문자'a'라면 갯수세기
	   
	   //ver-2    if('B'  소문자'a'라면 ){갯수세기}
	   //ver-2    if('a'  소문자'a'라면 ){갯수세기}
	   
	   //ver-3    if(ch[0] =='a' ){갯수세기}
	   //ver-3    if(ch[1] =='a' ){갯수세기}
	   
		//	   if(ch[0] =='a' ){  /*cnt++; */ cnt+=1; }
		//	   if(ch[1] =='a' ){  /*cnt++; */ cnt+=1; }
	   for(int i=0; i< ch.length; i++)
	   {   if(ch[i] =='a' ){  /*cnt++; */ cnt+=1; }   }
	   
	   System.out.println("ch 배열에서 a의 갯수 세기 >" + cnt);
	}
}

/*
연습문제4)  array
패키지명 : com.company.java006_ex
클래스명 :  ArrayEx004
    1. 배열명 : ch
    2. 값 넣기 : 'B' , 'a' , 'n' , 'a', 'n' , 'a'
    3. ch 배열에서 a의 갯수 세기
<<<<<<< HEAD
*/
=======
	public static void main(String [] args) {
		char[] ch = {'B', 'a', 'n', 'a', 'n', 'a'};
		int cnt = 0;
		
		//ver-0 ch 배열에서 a의 갯수 세기
		//ver-1 'B' 소문자 'a'라면 갯수 세기
		//ver-1 'a' 소문자 'a'라면 갯수 세기
		
		//ver-2 if('B' 소문자 'a'라면){갯수 세기}
		//ver-2 if('a' 소문자 'a'라면){갯수 세기}
		
		//ver-3 if(ch[0] == 'a'){갯수 세기}
		//ver-3 if(ch[1] == 'a'){갯수 세기}
		
		//ver-4	for(){}
		
		//a의 갯수 세기 if(arr?==a){ cnt++ }	syso(cnt "개")
//		for(int i=0; i<arr.length; i++) {for(ch=){ cnt++;} }
		
//		if(ch[0] == 'a'){ cnt++; }
//		if(ch[1] == 'a'){ cnt++; }
		for(int i=0; i<ch.length; i++){ if(ch[i] == 'a'){ cnt++; } }
		System.out.println(cnt);
	}
}
>>>>>>> origin/2
=======
*/
>>>>>>> 7efdcda83772e6541eb8f6835f99453a3a9fa1ff
