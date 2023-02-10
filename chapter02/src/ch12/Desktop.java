package ch12;

public class Desktop extends Computer{
	
	@Override
	public void display() {
		System.out.println("디스플레이합니다");
		
	}
	
	@Override
	public void typing() {
		System.out.println("키보드를 입력합니다");
		
	}
}
