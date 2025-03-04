package com.company.java006;

public class RepeatEx008 {
	public static void main(String [] args) {
		int sum = 0, val = 0;
		int i, o, p = 0;
		// 3의배수 i%3==0
		for(i=1; i<=10; i++){ if(i%3==0) { val += i; } }	System.out.println("1~10까지 3의 배수의 합은? = " + val);		val=0;
		o=0; while(o<=10){ if(o%3==0) { val += o; } o++;}	System.out.println("1~10까지 3의 배수의 합은? = " + val);		val=0;
		p=0; do{ if(p%3==0){ val += p; } p++;} while(p<=10);	System.out.println("1~10까지 3의 배수의 합은? = " + val);
		
		//ver-1 - 1이 3의 배수라면 합을 더해 주변수에 누적. 2이 3의 배수라면 합을 더해 주변수에 누적.
		//ver-2 - if(1이 3의 배수라면){합을 더해 주변수에 누적}...
		
		//변수
//		if(1%3==0) { sum+=1; }
//		if(2%3==0) { sum+=2; }
//		if(3%3==0) { sum+=3; }
		
		//출력
//		System.out.println("1~10까지 3의 배수의 합은? = " + sum);
	}
}
