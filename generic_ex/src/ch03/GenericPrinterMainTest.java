package ch03;

public class GenericPrinterMainTest {

	public static void main(String[] args) {

		Power power = new Power();
		Plastic plastic = new Plastic();
		// 사용방법
		GenericPrinter<Power> genericPrinter = new GenericPrinter<>();
		
		
		// 재료넣기
		// 최상위 클래스인 Object 를 활용하는 것 보다 안정적인 코드를 만들 수 있다.
		// 또한 가독성도 높아진다.
		// genericPrinter.setMaterial(plastic); //컴파일시점에서
		genericPrinter.setMaterial(power);
			
		// 재료꺼내기
		// 다운 캐스팅을 할 필요가 없다.
		Power usePower = genericPrinter.getMaterial();
		//Plastic usePower = genericPrinter.getMaterial(); 
		// 잘못된 데이터 타입을 대입하면 컴파일 시점에 오류를 잡아준다.
		
		// 결론: 보다 가독성이 높고 안정적인 프로그래밍을 만들 수 있다.
		// 같은 변수 이름 같은 기능이라면 제네릭 프로그래밍을 설계하면된다.
	}
}
