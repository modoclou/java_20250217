package com.company.java019;

//1. 프로세스 - 실행 중인 프로그램
//2. 프로세스 = 자원 + Thread(작업수행클래스)
//작업수행클래스	1) Thread 상속, Runnable #	2) run 해야할일	3) start 실행

class Animal{}
//class DogSound extends Animal, Thread{}	(X)

class EmojiSound extends Animal implements Runnable{
	@Override public void run() {	//#2. run 해야할일
		try { Thread.sleep(10); } catch (InterruptedException e) { e.printStackTrace(); }
		for(int i=0; i<5; i++) {
			System.out.print("돼지 ");
			try { Thread.sleep(100); } catch (InterruptedException e) { e.printStackTrace(); }
		}//1000이 1초
	}	
}

public class Thread003 {
	public static void main(String[] args) {
		Thread sound = new Thread(new EmojiSound());	sound.start();
		//Cannot instantiate the type Runnable → (){}, The type new Runnable(){} must implement the inherited abstract method Runnable.run()
		Thread count = new Thread(new Runnable() {
			@Override public void run() {
				for(int i=0; i<5; i++) {
					System.out.println("찰싹　　　　(´·ω·`)　　　　찰싹\r\n"
							+ "　 (´·ω·`)　Ｕ☆ミ　(´·ω·`)\r\n"
							+ "　　　⊂彡☆))Д´)☆ミ⊃　찰싹\r\n"
							+ "　　　 　∩彡☆ ☆ミ∩\r\n"
							+ "　(　　　　)　 찰싹　(　　　　)\r\n"
							+ "　찰싹\r\n");
					try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
				}
			}
		}); count.start(); //#3. start
		
		
		for(int i=0; i<5; i++) {
		System.out.println("찰싹　　　　(´·ω·`)　　　　찰싹\r\n"
				+ "　 (´·ω·`)　Ｕ☆ミ　(´·ω·`)\r\n"
				+ "　　　⊂彡☆))Д´)☆ミ⊃　찰싹\r\n"
				+ "　　　 　∩彡☆ ☆ミ∩\r\n"
				+ "　(　　　　)　 찰싹　(　　　　)\r\n"
				
				+ "　찰싹\r\n");
		try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
		}
		
	}
}
