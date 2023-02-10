package ch01;

public class MainTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentpak = new Student();
		studentpak.studentName = "박현진";
		studentpak.studentId = 3;
		studentpak.address = "부산시 해운대구";
		studentpak.test();
		studentpak.clean();
		studentpak.eat();
		studentpak.showInfo();
	}

}
