package com.company.java005;

import java.util.Scanner;

public class Bank_v1_control {
	public static void main(String [] args) {
		//변수
		int num; char id=' ', pass=' '; int bal=0;
		Scanner sc = new Scanner(System.in);
		
		//입력 + 입력 + 처리 + 출력
		// Step1. 메뉴판 무한반복
		System.out.print("WELCOME! (주)CODEBANK\n");
		for(;;) {
			System.out.print("======BANK====== \n * 1. 추가 \n * 2. 조희 \n * 3. 입금 \n * 4. 출금 \n * 5. 삭제 \n * 6. 종료 \n 입력>>> ");
			num = sc.nextInt();
			if(num==9) {System.out.println("종료 기능입니다."); break;}
			
			//Step2. 기능
			switch(num) {
			case 1: System.out.print("추가기능입니다.\n");
				//Step3. 추가
				//*ID :   _입력받기 first
				//*PASS :   _입력받기 1111 
				//*BALANCE : _입력받기 10000
					System.out.print("아이디 입력 : "); 		id = sc.next().charAt(0);
					System.out.print("비밀번호 입력 : "); 	pass = sc.next().charAt(0);
					System.out.print("잔액 입력 : "); 		bal = sc.next().charAt(0);
					break; //end
					
			case 2: System.out.println("조회기능입니다.\n"); 
				//Step4.
				//변수 - 임시변수 temp_id, temp_pass
				// temp_id 입력받아서 id랑 일치하면 temp_pass로 진행 아니라면(else) 다시 입력하세요
				
				//입력 - 아이디 비밀번호(임시변수 temp_id, temp_pass) 입력
				//처리 - temp_id와 id가 같고 temp_pass와 pass가 같다면 사용자 정보 출력
				//아니라면 다시 입력하세요.
			char temp_id=' ', temp_pass=' ';
					System.out.print("아이디 입력 : ");		temp_id = sc.next().charAt(0);
					System.out.print("비밀번호 입력 : ");	 	temp_pass = sc.next().charAt(0);
					if(temp_id == id && temp_pass == pass) {
						System.out.print("아이디 : " + id + "\n비밀번호 : " + pass + "\n잔액: " + bal);
					} else {System.out.println("다시 입력하세요.");}
			case 3: System.out.println("입금기능입니다.\n"); break;
			case 4: System.out.println("출금기능입니다.\n"); break;
			case 5: System.out.println("삭제기능입니다.\n"); break;
			} //switch end
			
			//Step3. 추가
			//*ID :   _입력받기 first
			//*PASS :   _입력받기 1111 
			//*BALANCE : _입력받기 10000

			//Step4. 조회
			
			//*ID : first
			//*PASS : 1234
			//조회가 실패했습니다. 

			//*ID : first
			//*PASS : 1111
			
			//======조회결과======
			//아이디 : first 
			//잔액 : 10000
			//암호 : 1111
			//조회가 성공했습니다. 
		}
	}
}
