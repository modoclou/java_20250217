package com.company.java006_ex;

public class ArrayEx005 {
	public static void main(String [] args) {
		char[] ch = {'B', 'a', 'n', 'a', 'n', 'a'};
		int cnt = 0, cnt1 = 0;
//		1. 배열명 : ch
//	    2. 값 넣기 : 'B' , 'a' , 'n' , 'a', 'n' , 'a'
//	    3. ch 배열에서 대문자의 갯수카운트, 소문자의 갯수 카운트
		
		//ver-0  ch 배열에서 대문자의 갯수카운트, 소문자의 갯수 카운트
		//ver-1 'B' 대문자라면 {개수 카운트}
		//ver-1 'B' 소문자라면 {개수 카운트}
		//ver-1 'a' 대문자라면 {개수 카운트}
		//ver-1 'a' 소문자라면 {개수 카운트}

		//ver-2 if('B' 대문자라면){개수 카운트}
		//ver-2 else if('B' 소문자라면){개수 카운트}
		
		//ver-2 if('a' 대문자라면){개수 카운트}
		//ver-2 else if('a' 소문자라면){개수 카운트}
		
//		//ver-3 
//		if(ch[0]>='A' && ch[0]<='Z' ){ cnt++; }
//		else if(ch[0]>='a' && ch[0]<='z'){ cnt1++; }
//
//		if(ch[1]>='A' && ch[1]<='Z' ){ cnt++; }
//		else if(ch[1]>='a' && ch[1]<='z'){ cnt1++; }

		//ver-3
		for(int i=0; i<ch.length; i++){ if(ch[i]>='A' && ch[i]<='Z' ){ cnt++; }
		else if(ch[i]>='a' && ch[i]<='z'){ cnt1++; } }
		
		System.out.println(cnt);
		System.out.println(cnt1);
	}
}
