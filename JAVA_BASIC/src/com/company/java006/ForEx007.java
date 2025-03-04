package com.company.java006;

public class ForEx007 {
	public static void main(String [] args) {
		//12345
		for(int i=1; i<=5; i++) { System.out.print( i + "\t"); } System.out.println();
		int i=1; while(i<=5) { System.out.print( i + "\t"); i++;} System.out.println();
		i=1; do{ System.out.print( i + "\t"); i++;} while(i<=5); System.out.println();
		
		//54321
		for(i=5; i>=1; i--) { System.out.print( i + "\t"); } System.out.println();
		i=5; while(i>=1) { System.out.print( i + "\t"); i--;} System.out.println();
		i=5; do{ System.out.print( i + "\t"); i--;} while(i>=1); System.out.println();
		
		//JAVA1   JAVA2  JAVA3
		for(i=1; i<=3; i++) { System.out.print("JAVA" + i + "\t"); } System.out.println();
		i=1; while(i<=3) { System.out.print("JAVA" + i + "\t"); i++;} System.out.println();
		i=1; do{ System.out.print("JAVA" + i + "\t"); i++;} while(i<=3); System.out.println();
	}
}
