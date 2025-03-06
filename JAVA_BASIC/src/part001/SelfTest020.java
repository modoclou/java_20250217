package part001;

/**
 	return 
   	1. 메인은 다음과 같다.
	System.out.println(  hi("sally"));
   	2. 다음과 같이 출력    Hi! sally~! 
 **/

public static String hi(String name) { return "Hi! " + name + "~!"; }

public class SelfTest020 {
	public static void main(String[] args) {		
		System.out.println(hi("sally"));
	}
}
