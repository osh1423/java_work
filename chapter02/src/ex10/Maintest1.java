package ex10;
// 다른 패키지에 .java 파일 이라면 import 해야 사용 할 수 있다.
import ch06.Bank;

public class Maintest1 {
	
	public static void main(String[] args) {

		Bank bankA = new Bank();
		// bankA.balance 접근불가
		// why : 다른 패키지에서 default 접근제어지시자를
		//접근 할 수 없다.
		bankA.name = "홍길동";
		// name  접근제어 지시자는 public 이기떄문에
		// 같은 프로젝트 안이라면 어디서든 접근 가능하다.
		
	}
}
