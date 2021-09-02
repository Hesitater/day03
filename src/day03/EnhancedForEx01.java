package day03;

import java.util.Arrays;

public class EnhancedForEx01 {
	public static void main(String[] args) {

		// 향상된 포문
		int[] arr = { 1, 2, 3, 4, 5 };

//		일반 for문
//		for(int i = 0; i < arr.length; i++ ) {
//			System.out.println(arr[i]);
//			
//		}

		for (int a : arr) {
			System.out.println(a);
		}

		System.out.println("--------------------------");

		String[] arr2 = { "월", "화", "수", "목", "금", "토", "일" };

		for (String str : arr2) {
			System.out.print(str + "\n");
		}

		System.out.println("-----------------------------------");
		int[] arr3 = { 10, 20, 30, 40, 50 }; // 합계 , 평균

//		int sum = 0;
//
//		for (int i : arr3) {
//			sum += i;
//		}
//		System.out.println("평균 : " + sum / arr3.length + ", 합계 : " + sum);

		for (String s : arr2) {
			System.out.println(s + "요일");
		}
		System.out.println("-----------------------------------");
	
		
			int[] arr4 = { 10, 20, 30, 40, 54 }; // 합계 ㅍㅇ균
			int sum = 0;
			
			for (int a : arr4) {
				sum += a;

			}
			double avg = sum / (double) arr.length; // 평균
			System.out.println("합계" + sum);
			System.out.println("평균" + avg);

		
	}
}
