package day03;

public class DoWhileEx01 {
	public static void main(String[] args) {
		
		//while 문 1~10까지 합
		int a = 1;
		int sum01 = 0;
		while (a <= 10) {
			sum01 += a;
			a++;

		}
		System.out.println(a);
		System.out.println(sum01);

		System.out.println("---------------------------------------------");

		// do~while문은 조건 검사가 마지막에 일어나기 떄문에 한번은 무조건 실행되는 특징이 있다.

		int i = 1;
		int sum = 0;

		do {
			sum += i;
			i++;
		} while (i <= 10);

		System.out.println("i의값: " +i);
		System.out.println("합계: " + sum);

		int y = 1;
		int sum02 = 0;

		do {
			sum02 += y;
			y++;

		} while (false);
		System.out.println(y);
		System.out.println("합" + sum02);

	}
}
