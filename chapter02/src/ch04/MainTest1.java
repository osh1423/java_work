package ch04;

public class MainTest1 {
	// 코드의 시작점
	public static void main(String[] args) {
		Bus bus = new Bus(100);
		bus.take(1); //태우다
		bus.take(1); //태우다
		bus.take(3); //태우다
		bus.takeOff(1);
		bus.showInfo();		
		
		Subway subway = new Subway(2);
		subway.take(1);
		subway.take(1);
		subway.take(2);
		subway.takeOff(2);
		subway.ShowInfo();
	}
}
