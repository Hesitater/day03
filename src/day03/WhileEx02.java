package day03;

import java.util.Scanner;

public class WhileEx02 {
	public static void main(String[] args) {

		// 문제 약수의 개수 구해보기 10의 약수 1,2,5,10
		// 1부터 자기 자신까지 나눴을때 나머지가 0인 개수

		Scanner scan = new Scanner(System.in);

		System.out.print(" 약수의 갸수를 확인 할 정수입력>");
		int num = scan.nextInt();

		int a = 1;
		int count = 0; // 약수의 개수를 누적할 변수

		while (a <= num) {

			if (num % a == 0) { // a: 1,2,3,4....num
				count++;

			}

			a++;

		}

		System.out.println(num + "의 약수의 개수:" + count);

		scan.close();
		
	}
}
