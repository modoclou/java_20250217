package com.company.java014;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception003 {
	public static void main(String[] args) {
		int a=-1;
		Scanner sc = new Scanner(System.in);
		while(true) {
			try{ 
				System.out.print("숫자 1 입력 > ");	
				a = sc.nextInt(); 	//1. nextInt() 숫자입력받기를 기다림.
									//2. 'a'
				if(a==1) {break;}
			} catch(InputMismatchException e) {
				sc.next(); //3. a처리
				System.out.println("숫자입력하세요.");
				
			}
//		while(true) {
//			System.out.print("숫자 1 입력 > ");	
//			try{ a = sc.nextInt(); }
//			catch(InputMismatchException e) {System.out.println("숫자입력하세요.");}
//			if(a==1) {break;}
			
/*								#1 복사 - InputMismatchException
Exception in thread "main" java.util.InputMismatchException
	at java.base/java.util.Scanner.throwFor(Scanner.java:964)
	at java.base/java.util.Scanner.next(Scanner.java:1619)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2284)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2238)
	at com.company.java014.Exception003.main(Exception003.java:10)	#2. 줄 수 exception
 */
		}
	}
}
