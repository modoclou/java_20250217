package com.company.java014;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception004 {
	public static int nextInt() throws InputMismatchException{ //##2-2 발생한 지점
		int a=-1;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 1 입력 > ");	
		a = sc.nextInt(); 	//1. nextInt() 숫자입력받기를 기다림.
							//2. 'a'
		return a;
	}
	public static void main(String[] args) /*throws Exception*/ {
		int a=-1;
		while(true){
		try {
			a=nextInt();	//##2-2 오류 Exception(missmatch) 후 Exception nextInt에서 입력받음. 오류만 던져준다
			if(a==1) {break;}
		}catch(Exception e) {System.out.println("오류");}
		}
	}
			
/*	1) main 안에서 															//##1 복사 - InputMismatchException
Exception in thread "main" java.util.InputMismatchException
	at java.base/java.util.Scanner.throwFor(Scanner.java:964)
	at java.base/java.util.Scanner.next(Scanner.java:1619)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2284)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2238)
	at com.company.java014.Exception004.nextInt(Exception004.java:11)
	at com.company.java014.Exception004.main(Exception004.java:16)			//##2. 줄 수 exception
	
	2) method
Exception in thread "main" java.util.InputMismatchException
	at java.base/java.util.Scanner.throwFor(Scanner.java:964)
	at java.base/java.util.Scanner.next(Scanner.java:1619)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2284)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2238)
	at com.company.java014.Exception004.nextInt(Exception004.java:11)		//##2-2. 발생한 지점
	at com.company.java014.Exception004.main(Exception004.java:16)			//##2-1. 호출한 친구
 */
}
