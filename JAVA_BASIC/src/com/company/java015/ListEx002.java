package com.company.java015;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> numbers = new ArrayList<>();
		numbers.add("one");
		numbers.add("two");
		numbers.add("three");
		int a=0;
		System.out.print("1, 2, 3 중 숫자를 입력 > ");	a = sc.nextInt();
		switch(a) {
		case 1 : System.out.println(numbers.get(0));	break;
		case 2 : System.out.println(numbers.get(1));	break;
		case 3 : System.out.println(numbers.get(2));	break;
		default : System.out.print("1, 2, 3 중 숫자를 입력 > ");	a = sc.nextInt();
		}
//		System.out.println(numbers);
	}
}
