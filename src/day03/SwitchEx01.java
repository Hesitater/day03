package day03;

public class SwitchEx01 {
	public static void main(String[] args) {

		int a = 1;

		// 소괄호에 특정값 이들어감 정수, 문자, 문자열이 switch의 소괄호에 들어갑니다.
		// 대응 되는 타입이 들어감 ex) int a = 1 -> case 1 -> break;
		// break; case 구문을 빠져 나올 수 있게 하는 장치
		// 순서는 위에서 아래로
		// default : 는 case에 해당하지 않는 것들을 나머지를 보내는곳이라고 생각하면 편할듯?
		switch (a) {

		case 0:
		case 1:
			System.out.println("1입니다");
			break;// switch문을 즉시 빠져나옵니다
		case 2:
			System.out.println("2입니다");
			break;
		case 3:
			System.out.println("3입니다");
			break;

		default: // case 들이 다 아닐때 default : 값이 나온다
			System.out.println("1,2,3,이 아닙니다");
			break;

		}

	}
}
