package com.company.java006_ex;

public class ArrayEx004 {
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