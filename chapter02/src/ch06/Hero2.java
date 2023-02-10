package ch06;
//코린이들이 많이 하는 실수!!
public class Hero2 {
	
	// 식을 바로 사용할 수 없다.
	// 메서드 선언을 중첩으로 할 수 없다.
	// 생성자에는 리턴타입 없다.(선언부)
	// 클래스 스코프 안에 사용할 수 있는 문법
	// 변수사용
	// 생성자 사용 가능
	// 메서드 사용 가능
	// 함수 사용 가능
	// 내부 클래스 -->
	//private String name = 1 * 2 + 10; //사용불가 -메서드 안이나 생성자 안에서 연산가능
	private int hp;
	private int power;
	private double defense;
	private boolean die;

//	public void getName() {
//		// 메서드안에 메서드를 선언할수 없다. --> 중괄호 범위를 잘 확인해야한다.
//		public void printArticle() {
//			
//		}
//		return this.name;
//		return null;
//	}
	// 함수이다. 
	public static int addNumber(int n1, int n2) {
		return n1 + n2;
	}
	// 할수 없다
//	public static int addNumber(int n1, int n2) {
//		return n1 + n2;
//	}
	
	
	
}
// 방어적 코드도 추가해 보세요