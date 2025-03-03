package com.company.java009;

class Student001{
	String name; int no, kor, eng, math;
//	int sum = this.kor+this.eng+this.math;
//	System.out.println(""+ "총점 : " + (sum );
//	System.out.println("평균 : %.2f" + sum/3f);
	void info() { System.out.println( this.name + "\t" ); 
	System.out.println("총점 : " + (this.kor+this.eng+this.math) );
	System.out.printf("평균 : %.2f", (this.kor+this.eng+this.math)/3f);
	}
}

public class ClassEx001 {
	public static void main(String [] args) {
		Student001 s1 = new Student001();
		s1.name="first"; s1.no=11; s1.kor=100; s1.eng=100; s1.math=99;
		s1.info();
	}
}