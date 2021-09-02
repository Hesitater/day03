package day03;

import java.util.Arrays;

public class WhileEx04 {
	public static void main(String[] args) {

		// 배열과 반복문 a이하랑 a+1미만 이랑 정수.. 같다

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(Arrays.toString(arr));

		int i = 0; // 제어변수 시작값
		int sum = 0;
		while (i < arr.length) { // i < 7 0~6까지

//			System.out.println(i);
//			System.out.println(arr[i]);

			sum += arr[i];

			i++;
		}

		System.out.println("배열요소의합 : " + sum);

	}
}
