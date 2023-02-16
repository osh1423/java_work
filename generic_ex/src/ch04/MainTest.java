package ch04;

public class MainTest {

	public static void main(String[] args) {

		GenericPrinter<Power> genericPrinter1 = new GenericPrinter<>();
		GenericPrinter<Plastic> genericPrinter2 = new GenericPrinter<>();
		// GenericPrinter<Water> genericPrinter3 = new GenericPrinter<>();
		
		// 재료 넣기
		genericPrinter1.setMaterial(new Power());
		genericPrinter2.setMaterial(new Plastic());
		
	// 문제
		// 제네릭을 활용한 프로그램을 작성하고 테스트해주세요~
		GenericDish<Power> genericDish1 = new GenericDish<>();
		GenericDish<Plastic> genericDish2 = new GenericDish<>();
		
		genericDish1.setMaterial(new Power());
		genericDish2.setMaterial(new Plastic());
		
		
	}

}
