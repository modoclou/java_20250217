package com.company.java019;

import java.awt.Toolkit;

//1. 프로세스 - 실행중 프로그램
//2. 프로세스 = 자원 + Thread(작업수행)
//3. 작업수행클래스	1) 상속, Runnable 2) run() 해야할일		3) start() 걸어서 실행

class PigSound extends Thread{ //#1. 상속 Thread(작업수행클래스)
	@Override public void run() { //#2. run 해야할일
		try { Thread.sleep(10); } catch (InterruptedException e) { e.printStackTrace(); }
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
		}
	}
}

class PigCount extends Thread{ //#1. 작업수행클래스 상속
	@Override public void run() {
		for(int i=1; i<=5; i++) {
		System.out.println(i + "마리");
		try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
		}
	}//end run
}


public class Thread002 {
	public static void main(String[] args) { //한 개의 스레드
		//여러 가지 일을 동시에
		//작업스레드 ## 3단계
		Thread sound = new PigSound();	sound.start(); 
		Thread count = new PigCount();	count.start(); 
		for(int i=0; i<5; i++) {
			//(˙ Ꙫ ˙) 5번
			System.out.println("  (\\_(\\\r\n"
					+ "(„• ֊ •„)\r\n"
					+ "  O☕O\r\n"
					+ "");
//			Thread sound = new PigSound();	sound.start(); 
			try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
		}
		//작업스레드 3단계
//		Thread sound = new PigSound();	sound.start();	5번 출력 후 소리가 남 
	}
}
