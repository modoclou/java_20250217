package com.company.java018;

public class JavaIO006_String_StringBuffer {
	public static void main(String[] args) {
		//#1. String 문자열 누적
		String str = "ABC";					//336484883
		System.out.println("1. str 주소 > " + str + " " + System.identityHashCode(str));

		str+="D";							//255944888
		System.out.println("2. str 주소 > " + str + " " + System.identityHashCode(str));
		
		//#2. StringBuffer 문자열 누적
		StringBuffer sb = new StringBuffer();
		sb.append("ABC");
		System.out.println("3. sb 주소 > " + str.toString() + " " + System.identityHashCode(sb));
		sb.append("D");
		System.out.println("4. sb 주소 > " + str.toString() + " " + System.identityHashCode(sb));
	}
}
