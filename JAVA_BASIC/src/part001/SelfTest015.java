package part001;

/**
 	배열(1)
	1. 숫자형공간이 5개인  배열 arr 만들기
	2. for구문을 이용하여  1~5까지 입력
	3. for구문을 이용하여  1~5까지 출력 
 **/

public class SelfTest015 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5}; //0~4
		for(int i=0; i<arr.length; i++) { System.out.print(arr[i] + "\t"); }
	}
}
