package com.company.java015;

import java.util.ArrayList;

/*
 1. ArrayList이용해서 color 만들기
 2. red, green, blur 데이터 추가
 */

public class ListEx001 {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		System.out.println(colors);
	}
}
