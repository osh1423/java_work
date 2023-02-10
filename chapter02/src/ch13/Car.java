package ch13;
/*
 * 템플릿 메서드 패턴을 구현
 * 핵심 run()메서드이다.
*/
public abstract class Car {
	
	protected  abstract void drive();
	protected  abstract void stop();
	
	private void startCar() {
		System.out.println("시동을 켭니다.");
	}
	private void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	public abstract void wiper(); 
	
	// 후크메서드
	public void washCar() {
		// 아무것도 구현 하지 않음 --> 일반메서드이다.
	}
	
	// 실행에 흐름을 만들어 둔다.
	// final (메서드앞) -> 재정의 할 수 없게 만든다.
	// 하위클래스에서 재정의 할수 없다.
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}

}
