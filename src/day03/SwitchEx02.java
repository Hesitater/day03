package day03;

import java.util.Scanner;

public class SwitchEx02 {
	public static void main(String[] args) {

		// IfEx02를 if문에서 switch 문으로 고치는 거 해보기
		// 케이스를 나눌때는 정수 나눠서 몫으로 구분하게도합니다.

		Scanner scan = new Scanner(System.in);

		System.out.println("점수입력>");
		int point = scan.nextInt();

		// 1~100 구분할때 case다 나누기보다 정수나누기 이용 몫으로 구분 하기도합니다

		switch (point / 10) {

		case 9:

			if (point >= 95) {
				System.out.println("A+");
			} else {
				System.out.println("A");
			}

			break;

		case 8:
			System.out.println("B");
			break;

		case 7:
			System.out.println("C");
			break;

		case 6:
			System.out.println("D");
			break;

		default:
			System.out.println("F");
			break;
		}

		scan.close();
		
	}
}
