package part001;

/**
 	이차원배열
 	1. 2*3배열만들기
 	2. for구문을 이용하여 다음과 같이 데이터 입력
 	3. for구문을 이용하여 다음과 같이 데이터 출력
 	   100	101  102
 	   200	201  202 
 **/

public class SelfTest016 {
	public static void main(String[] args) {
//		int data = 1;
		int[][] arr = {
				{ 100, 101, 102 },
				{ 200, 201, 202 }	};
		for(int i=0; i<arr.length; i++) {
			for(int v=0; v<arr[i].length; v++) {
				if(v%3==0) { System.out.println(); }
				System.out.print(arr[i][v]+ "\t"); }
		}
//		//3
//		System.out.println(num[0].length);
//		System.out.println(num[1].length);
	}

}
