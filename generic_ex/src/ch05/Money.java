package ch05;

public class Money extends item{
	
	@Override
	public String toString() {
		return "아이템은 돈입니다.";
	}
	public void addMoney() {
		System.out.println("돈으로 추가합니다.");
	}
	@Override
	public void doBoxing() {
		// TODO Auto-generated method stub
		
	}
}
