package com.company.java004_ex;

import java.util.Scanner;

public class IfEx006 {
	public static void main(String [] args) {
		int sex; String result = "여자입니다.";
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 하나를 입력하세요. > ");	sex = sc.nextInt(); //sc.next().charAt(0);
//		if(sex%2==0) { System.out.println("여자입니다."); }
//		if(sex%2==1) { System.out.println("남자입니다."); }
		if(sex%2==1) { result = "남자입니다."; }
		
		System.out.println(result);
		sc.close();
		
		//출력 if (홀수면){남자} else if (짝수면){여자} - num%2==0 짝수
		//출력 if (홀수면){남자} else    (짝수면){여자} - num%2==0 짝수
	}
}
