package com.company.java019;

import java.util.Scanner;

class Count extends Thread{ //#1) Thread 상속
	@Override public void run() { //#2) run
		for(int i=10; i>0; i--) {
			System.out.println(i);
			try { Thread.sleep(1000); } catch (InterruptedException e) { break; }
		}
	}
}

public class Thread004_interrupt {
	public static void main(String[] args) {
		Thread count = new Count();	count.start();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Count Stop?(y/n) > ");
		if(sc.next().equals("y")) {
			System.out.println("Count를 멈춥니다.");
			count.interrupt();
		}
	}
}
