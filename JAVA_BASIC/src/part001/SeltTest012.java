package part001;

import java.util.Scanner;

/**
while
 * 1~100사이를 입력할때까지 무한반복하기 
 * 만약 1~100사이를 입력하면 빠져나오기	
**/

public class SeltTest012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("1~100 사이를 입력하세요. > ");		num = sc.nextInt();
		while(num>=1 && num<=100) { ;;
			if(num>=1 && num<=100) { break; }
		}
	}
}