package ch08;

public class MainTest2 {

	public static void main(String[] args) {

		// 예외 처리 구문 작성
		try {
			int num = 10 / 0;
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		// 10/0 연산 시키고 예외 처리까지 작성해 주세요
		// 1. try
		// 2. 클래스 설계 throws 활용
		Calculator calculator = new Calculator();
		try {
			calculator.calculator(10, 0);
		}catch (Exception e) {
			System.out.println();
		}
	}

}

// throws는 클래스 설계
class Calculator {
	public int calculator(int n1, int n2) throws Exception {
		return n1 / n2;
	}
}
