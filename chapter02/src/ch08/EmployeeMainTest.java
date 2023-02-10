package ch08;

public class EmployeeMainTest {
	// 메인함수 - 코드의 시작점
	public static void main(String[] args) {

		Employee employee1 = new Employee();
		employee1.setName("이순신");
		System.out.println(employee1.serialNum);

		Employee employee2 = new Employee();
		employee2.setName("홍길동");

		Employee employee3 = new Employee();
		employee3.setName("티모");

		System.out.println(Employee.serialNum);
		
		// static변수만 사용하는 경우
		// 각각의 객체가 가지는 상태값을 저장해야 한다면
		// 멤버변수를 활용해야 한다.
		
		//홍길동 사원번호 확인
		System.out.println(employee2.getEmployeeId());
		
		//티모 사원번호 확인
		System.out.println(employee3.getEmployeeId());

	} // end of main

} // end of class
