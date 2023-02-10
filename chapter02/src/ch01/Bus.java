package ch01;

public class Bus {
	int busNumber;
	String address;
	
	public void go() {
		System.out.println(busNumber+"번 버스가 출발합니다.");
	}
	
	public void last() {
		System.out.println(address + "까지 갑니다.");
	} 
	
	public void showInfo() {
		System.out.println("버스 번호 : " + busNumber);
		System.out.println("버스 종점 : " + address);
	}
	public static void main(String[] args) {
		Bus bus87 = new Bus();
		bus87.busNumber = 87;
		bus87.address = "해운대";
		bus87.go();
		bus87.last();
		bus87.showInfo();
		
	}
}
