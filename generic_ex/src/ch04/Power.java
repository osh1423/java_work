package ch04;

public class Power extends Material{

	@Override
	public String toString() {
		return "재료는 파우더 입니다.";
	}

	@Override
	public void doPrinting() {
		System.out.println("파우더로 출력합니다");
		
	}

	@Override
	public void doMaking() {
		System.out.println("플라스틱으로 만듭니다");
		
	}
}
