package ch06;

public class MainTest1 {

	// 1. 리턴값이 int, 매개변수 n1, n2. n3 이름은 intAdd
	static int intAdd(int n1, int n2, int n3) {
//		int result = n1+n2+n3;
//		return result;
		return n1+n2+n3;
	}

	// 2. 리턴값이 double 매개변수 n1, n2 이름은 doubleAdd
	static double doubleAdd(double n1, double n2) {
		double result = n1 + n2;
		return result;
	}

	// 3. 리턴값 void, 매개변수는 String article, 함수이름은 printArticle 출력
	static void printArticle(String article) {
		System.out.println(article);
	}

	// 테스트 -실행 코드 main
	public static void main(String[] args) {
		
		
		System.out.println(intAdd(2, 2, 3));
		
		//double result2 = doubleAdd(0.5, 1.4);
		System.out.println(doubleAdd(10, 10));

		//오류발생
		//System.out.println(printArticle("반가워"););
		printArticle("반가워");
		
	}
}