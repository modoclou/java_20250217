package com.company.java019_ex;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

/*
	1. QuestionCount - 10부터 1까지 카운트 1초에 10, 2초에 9, 3초에 8...
	2. 사과 알파벳을 입력하세요
	   apple을 입력받으면 정답입니다. / 정답이 아닙니다.
 */
//방법2
class QuestionCount2 implements Runnable{ //#1) Thread 상속
	@Override public void run() { } //#2) run
}

//방법1 Thread	2) run 실행해야 하는 내용	3) start 실행
//class QuestionCount extends Thread{ //#1) Thread 상속
//	@Override public void run() { //#2) run
//		for(int i=10; i>0; i--) {
//			System.out.println(i);
//			try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
//		}
//	}
//}

//class Meow extends Thread{
//	@Override public void run() {
//		try { Thread.sleep(10); } catch (InterruptedException e) { e.printStackTrace(); }
//		for(int i=10; i<0; i--) {
//			System.out.println(i);
//			try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
//		}
//	}
//}

public class ThreadEx001 {
	public static void main(String[] args) {
		//실행1
		Thread count = new Thread(new Runnable() {
			@Override public void run() { //#2) run
				for(int i=10; i>0; i--) {
					System.out.println(i);
					try { Thread.sleep(1000); }
					catch (InterruptedException e) { e.printStackTrace(); }
				}
			}
		});
					
//		Toolkit toolkit = Toolkit.getDefaultToolkit();
//		Thread meow = new Thread();	meow.start();
		Thread count = new QuestionCount();	count.start();
		String answer = JOptionPane.showInputDialog("고양이 울음소리는?");	//toolkit.beep();
		System.out.println(answer);	//toolkit.beep();
		if(answer.equals("Meow")) { //정답이라면
			System.out.println("축하합니다."); } else { System.out.println("틀렸습니다."); }
		System.out.println("main-end");
	}
}
//문제점: 1) 정답을 맞춰도 count가 멈추지 않음	2) main이 끝났는데 다른 프로세스 실행 중