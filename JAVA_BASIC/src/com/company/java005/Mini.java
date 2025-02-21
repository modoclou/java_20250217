package com.company.java005;

import java.util.Scanner;

public class Mini {
	public static void main(String [] args) {
		//변수
		Scanner sc = new Scanner(System.in);
		int age, input, menu, depo, wid; int bal = 0;
		char id =' ', pass=' ';
		int n; //임시값
		
		//입력
		System.out.print("WELCOME! (주)CODEBANK\n");
		for(;;) {
			System.out.println("======BANK====== \n * 1. 추가 \n * 2. 조희 \n * 3. 입금 \n * 4. 출금 \n * 5. 삭제 \n * 6. 종료 \n 입력>>> ");
			input = sc.nextInt();
//			{continue;}
			if(input==9) {System.out.println("종료 기능입니다."); break;}
		}
		
		//Step2. 기능
		switch(num) {
		case 1: System.out.println("추가기능입니다.");
			//Step3. 추가
				System.out.println("아이디 입력 : "); 		id = sc.next().charAt(0);
				System.out.println("비밀번호 입력 : "); 	pass = sc.next().charAt(0);
				System.out.println("잔액 입력 : "); 		bal = sc.next().charAt(0);
			//*ID :   _입력받기 first
			//*PASS :   _입력받기 1111 
			//*BALANCE : _입력받기 10000
		case 2: System.out.println("조회기능입니다."); 
				System.out.println("아이디 입력 : ");		temp_id = sc.next().charAt(0);
				if(id==temp_id) {
					System.out.println("비밀번호 입력 : ");	 	temp_pass = sc.next().charAt(0);
				} else if (id!=temp_id) {
					System.out.println("다시 입력하세요.");}
				}
				if(id==temp_pass) {}
		
//		switch(input) {
//		case 1: { System.out.println("id : ");	id = sc.nextInt(); //sc로새로운값받기x 기존값과대비시키기
//				System.out.println("pass : ");	pass = sc.nextInt();
//				System.out.println("나이 : ");	age = sc.nextInt();
//				System.out.println("잔액 : ");	bal = sc.nextInt();
//				}
//		case 2: { System.out.println("id : ");	id = sc.nextInt();
//				System.out.println("pass : ");	pass = sc.nextInt();
//				System.out.println("나이 : ");	age = sc.nextInt();
//				System.out.println("잔액 : ");	bal = sc.nextInt();
//				}
//		case 3: { System.out.println("id : ");	id = sc.nextInt();
//				System.out.println("pass : ");	pass = sc.nextInt();
//				System.out.println("입금 : ");	depo = sc.nextInt();
//				}
//		case 4: { System.out.println("id : ");	id = sc.nextInt();
//				System.out.println("pass : ");	pass = sc.nextInt();
//				System.out.println("출금 : ");	wid = sc.nextInt();
//				}
//		}
		
//		for() {
//			if() {}
//		}
		//처리
		//출력
//		System.out.print("======BANK====== \n * 1. 추가 \n * 2. 조희 \n * 3. 입금 \n * 4. 출금 \n * 5. 삭제 \n * 6. 종료 \n 입력>>> \n");
	}
}
