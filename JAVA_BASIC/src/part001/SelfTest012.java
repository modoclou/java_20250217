package part001;

import java.util.Scanner;

/**
while
 * 1~100사이를 입력할때까지 무한반복하기 
 * 만약 1~100사이를 입력하면 빠져나오기	
**/

public class SelfTest012 {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("1~100 사이를 입력하세요. > ");		num = sc.nextInt();
			if(num>=1 && num<=100) { break; }
		}
	}
}
