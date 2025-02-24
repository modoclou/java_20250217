package com.company.java006;

public class RepeatEx009 {
	public static void main(String [] args) {
		//ver-1
//		//syso 'a', syso 'b' . . . println // syso 'f' ... 반복
//		System.out.print("A");System.out.print("B");System.out.print("C");System.out.print("D");System.out.print("E");System.out.println();
//		System.out.print("F");System.out.print("G");System.out.print("H");System.out.print("I");System.out.print("J");System.out.println();
//		System.out.print("K");System.out.print("L");System.out.print("M");System.out.print("N");System.out.print("O");System.out.println();
//		System.out.print("P");System.out.print("Q");System.out.print("R");System.out.print("S");System.out.print("T");System.out.println();
//		System.out.print("U");System.out.print("V");System.out.print("W");System.out.print("X");System.out.print("Y");System.out.println();
//		System.out.print("Z");System.out.println();
		//줄바꿈을 끝에 두거나, 앞에 둔다
		
		//ver-2
		//abcde \n fghhj \n klmno \n pqrst \n uvwxy \n z 5의 배수마다 \n
		//2) 알파벳과 어떻게 연결지을 것인가
//		if('A'%5==0) { System.out.println(); } System.out.print("A");
//		if('B'%5==0) { System.out.println(); } System.out.print("B");
//		if('C'%5==0) { System.out.println(); } System.out.print("C");
//		if('D'%5==0) { System.out.println(); } System.out.print("D");
//		if('E'%5==0) { System.out.println(); } System.out.print("E");
		
		for(char ch='A'; ch<='Z'; ch++) {if(ch%5==0) { System.out.println(); } System.out.print(ch); }
		char ch='A'; while(ch<='Z') {if(ch%5==0) { System.out.println(); } System.out.print(ch); ch++;}
		ch='A'; do {if(ch%5==0) { System.out.println(); } System.out.print(ch); ch++;} while(ch<='Z');
		
//		for(char ch ='a'; ch>='z'; ch++) { if(ch //그뭐시기...문자열 > 수열 변환	System.out.print(ch);}
	}
}
