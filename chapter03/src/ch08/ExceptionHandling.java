package ch08;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		// try catch finally
		// finally ? 언제사용할까
		Scanner scanner = new Scanner(System.in);
		try {
			int result = scanner.nextInt();	
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close(); // 자원 해제 용도로도 많이 사용된다.
		}
		
		
		
		
	} // end of main
} // end of class
