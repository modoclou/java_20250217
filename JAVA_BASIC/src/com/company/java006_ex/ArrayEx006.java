package com.company.java006_ex;

public class ArrayEx006 {
	public static void main(String [] args) {
		char [] ch = {'B', 'a', 'n', 'a', 'n', 'a'};
		int upper = 0, lower = 0;
		
		//ver-1 'B' 대문자라면 {개수 카운트}, 'B' 소문자라면 {개수 카운트}
		//ver-1 'a' 대문자라면 {개수 카운트}, 'a' 소문자라면 {개수 카운트}
		//ver-2 if('B' 대문자라면){개수 카운트} else if('B' 소문자라면){개수 카운트}
		//ver-2 if('a' 대문자라면){개수 카운트} else if('a' 소문자라면){개수 카운트}
		//ver-3
		//if(ch[0]>='A' && ch[0]<='Z'){upper++;}
		//else if(ch[0]>='a' && ch[0]<='z'){lower++;}
		//if(ch[1]>='A' && ch[1]<='Z'){upper++;}
		//else if(ch[1]>='a' && ch[1]<='z'){lower++;}
		
		for(int i=0; i<ch.length; i++) {
			if(ch[i]>='A' && ch[i]<='Z'){upper++;}
			else if(ch[i]>='a' && ch[i]<='z'){lower++;}
		}
	}
}
