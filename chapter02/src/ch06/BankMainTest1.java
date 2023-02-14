package ch06;

public class BankMainTest1 {

	public static void main(String[] args) {

		Bank bankB = new Bank();
		bankB.deposit(10_000);
		bankB.withdraw(6_000);

		// 입.출금 기능으로 하지않고 실수로 멤버 변수에 접근해서 수정할 경우
		// bankB.balance = 100_000; // private 선언하는 순간 외부에서 접근불가!!
		// 실수 할 가능성이 생긴다.
		// 예방->접근제어 지시자를 할당한다 -> private
		// 정보출력
		bankB.showInfo();

		// 현재 계좌 잔액을 지역변수에 담아보기
		int currentMoney = bankB.getBalance(); // <=get 메서드 사용
		System.out.println("currentMoney : " + currentMoney);

		// set 메서드 사용해보기
		bankB.setBalance(200_000);
		bankB.showInfo();

	} // end of main

} // end of class
