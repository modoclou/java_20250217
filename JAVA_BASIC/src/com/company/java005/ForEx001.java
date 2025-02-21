package com.company.java005;

public class ForEx001 {
	public static void main(String [] args) {

	System.out.print("Q1 : " );
	for(int i=1; i<=5; i++) { System.out.print(i); } System.out.println();
	
	System.out.print("Q2 : " );
	for(int i=5; i>=1; i--) { System.out.print(i); } System.out.println();
	
	System.out.print("Q3 : " );
	for(int i=1; i<=3; i++) { System.out.print("JAVA" + i + "\t"); } System.out.println();
	
	System.out.print("Q4 : " );
	for(int i=3; i>=1; i--) { System.out.print("HAPPY" + i + "\t"); } System.out.println();
	
	System.out.print("Q5 : " );
	for(int i=0; i<=2; i++) { System.out.print((i==0? "" : ", ") + i); } System.out.println();
	
	System.out.print("Q6 : " );
	for(int i=0; i<=99; i++) { System.out.print((i==0? "" : ", ") + i); } System.out.println();
	
	System.out.print("Q7 : " );
	for(int i=10; i>=1; i--) { System.out.print((i==0? "" : ", ") + i); } System.out.println();
	
	System.out.print("Q8 : " );
	for(int i=0; i<=8; i++) { if(i%2==0) {System.out.print((i==0? "" : ", ") + i);} } System.out.println();
	
	System.out.print("Q9 : " );
	for(int i=0; i<=18; i++) { if(i%2==0) {System.out.print((i==0? "" : ", ") + i);} } System.out.println();	
	}
}