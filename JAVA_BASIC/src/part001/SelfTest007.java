package part001;

import java.util.Scanner;

/**
 	a,b,c중에 입력해주세요
 	a또는 A라면 apple
 	b또는 B라면 banana
 	c또는 C라면 coconut
 	그이외 대소문자 관계없이 a,b,c만 입력가능합니다  
 **/

public class SelfTest007 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch=' ';
		
		System.out.print("a, b, c 중에 입력해주세요. > ");	ch = sc.next().charAt(0);
		switch(ch) {
		case 'a' | 'A' : System.out.println("apple"); break;
		case 'b' | 'B' : System.out.println("banana"); break;
		case 'c' | 'C' : System.out.println("coconut"); break;
		default : { System.out.println("대소문자 관계 없이 a, b, c만 입력 가능합니다."); } 
		}
	}
}
