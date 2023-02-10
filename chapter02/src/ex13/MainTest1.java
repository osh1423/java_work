package ex13;

import java.util.Random;

public class MainTest1 {
	public static void main(String[] args) {

		// 우리반 학생 이름들을 배열에 담아 주세요.
		// 랜덤 클래스를 사용해서
		// 한명을 추출해 주세요.
		final int arrSize = 10;
		Random rando = new Random();
		Student[] studentArr = new Student[arrSize];
		studentArr[0] = new Student("배진석");
		studentArr[1] = new Student("이현서");
		studentArr[2] = new Student("한범진");
		studentArr[3] = new Student("손주이");
		studentArr[4] = new Student("오세훈");
		studentArr[5] = new Student("김유주");
		studentArr[6] = new Student("이지운");
		studentArr[7] = new Student("김미정");
		studentArr[8] = new Student("김민우");
		studentArr[9] = new Student("강민정");

		int randIndex = rando.nextInt(arrSize);
		System.out.println(studentArr[randIndex].getName());

		// 2
		int[] myNumbers = new int[10];
		myNumbers[0] = 10;
		myNumbers[1] = 4;
		myNumbers[2] = 100;
		myNumbers[3] = 23;
		myNumbers[4] = 51;
		myNumbers[5] = 1;
		myNumbers[6] = 6;
		myNumbers[7] = 88;
		myNumbers[8] = 42;
		myNumbers[9] = 31;
		
		int num = 0;
		for (int i = 0; i < myNumbers.length; i++) {
			for (int j = 0; j < myNumbers.length; j++) {
				if (myNumbers[i] < myNumbers[j]) {
					num = myNumbers[j];
					myNumbers[j] = myNumbers[i];
					myNumbers[i] = num;
				}
			}
		}
		for (int i = 0; i < myNumbers.length; i++) {
			System.out.println(i + ": " + myNumbers[i]);
	}
}
}
