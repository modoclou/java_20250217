package part001;

/**
	1.4*5 배열만들기
 	2.배열에 1~20까지 데이터 입력
 	3.다음과 같이 출력하기 
 	
 	1	2	3	4	5
 	6	7	8	9	10
 	11	12	13	14 	15
 	16	17	18	19	20
 **/

//5%==0 마다 줄바꿈

public class SelfTest017 {
	public static void main(String[] args) {
		int[][] arr = new int[4][5];
		arr[0] = new int[]{1, 2, 3, 4, 5};       // 0-4
        arr[1] = new int[]{6, 7, 8, 9, 10};      // 5-9
        arr[2] = new int[]{11, 12, 13, 14, 15};  // 10-14
        arr[3] = new int[]{16, 17, 18, 19, 20};  // 15-19
        
        for(int i=0; i<arr.length; i++) {
        	for(int v=0; v<arr[i].length; v++) {
        		if(v%5==0) { System.out.println(); }
        		System.out.print(arr[i][v]+ "\t");

//        for(int i=0; i<arr.length; i++) {
//			for(int v=0; v<arr[i].length; v++) {
//				System.out.print(arr[i][v] + "\t");	}
//			for(i=0; i<arr2.length; i++) {
//				for(int v=0; v<arr2[i].length; v++) {
//					System.out.print(arr2[i][v] + "\t");	}

//		int[4][5] arr3 = {
//				{ 1, 2, 3, 4, 5 },
//				{ 6, 7, 8, 9, 10 },
//				{ 11, 12, 13, 14, 15 },
//				{ 16, 17, 18, 19, 20 }	};
//		int[][] arr = {
//				{ 1, 2, 3, 4, 5 },
//				{ 6, 7, 8, 9, 10 }	};
//		int[][] arr2 = {
//				{ 11, 12, 13, 14, 15 },
//				{ 16, 17, 18, 19, 20 }	};
			}
		}
	}
}