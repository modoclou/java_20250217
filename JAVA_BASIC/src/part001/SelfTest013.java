package part001;

import java.util.Scanner;

/**
 for 응용
	원하는 단을 입력하세요 _예) 2단
	2*1 =2
	2*2 =4 ...
 **/

public class SelfTest013 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int val;
		
		System.out.print("출력할 단을 입력해 주세요 (2~9) > ");	val = sc.nextInt();
		
		for(int i=1; i<9; i++) { System.out.println(val + "*" + i + "=" + (val*i)); }
	}
}
