package com.company.java005;

public class ForEx005 {
	public static void main(String [] args) {
		//변수
		int cnt = 0;
		//입력
		
		//처리
		
		//출력
		//ver1   대상이 어떠하다 
		//if(a가 모음이라면) {카운트: 갯수 증가}
		//if(b가 모음이라면) {카운트: 갯수 증가}
		//if(c가 모음이라면) {카운트: 갯수 증가}
		
		//ver2   구조   a가 a, e, i, o, u 
		//if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u' ) {카운트: 갯수 증가 cnt++;}
		//if(b=='a' || b=='e' || b=='i' || b=='o' || b=='u' ) {카운트: 갯수 증가 cnt++;}
		//if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ) {카운트: 갯수 증가 cnt++;}
		
		//반복 'a'를 ch로 치환
//		{ if('a'=='a' || 'a'=='e' || 'a'=='i' || 'a'=='o' || 'a'=='u' ) { cnt++; } }
		for(char ch='a'; ch<='z'; ch++)
		{ if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ) { cnt++; } }
		System.out.println("소문자 a~z까지 모음의 갯수 > " + cnt);
	}
}
