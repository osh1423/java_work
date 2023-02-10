package ch03;

public abstract class ShortCircuitTest {

	public static void main(String[] args) {
		
		// 관계 논리곱 --> F --> F, 논리합 --T --T
		
		int num1 = 5;
		int i = 0;
//		                                                 F             &&             T
		boolean value  = ( (num1 += 10) < 10 ) && ( (i += 2) < 10 );
		System.out.println(value);
		System.out.println("===================");
		System.out.println(num1);
		System.out.println(i); 
		
		System.out.println("===================");
		//                             F              ||           T
		value = ( (num1 += 10) < 10 ) || ( (i += 2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		// 문제
		
		// 문제 shortCircuit 평가 문제를 직접 2문제 만들어 보세요.
		
		int num2 = 7;
		int k = 0;
		

		boolean val = ( (num2 += 2) > 10) && ((k += 2 ) < 10 );
		
		System.out.println(val); // F && T -->F
		System.out.println(num2); //shortCircuit에 의해 
		System.out.println(k); //k값은 0
		

		val = ( (num2 += 2) > 10) || ((k += 1) > 0);
		
		System.out.println(val); // T || T --> T
		System.out.println(k); //shortCircuit에 의해
		System.out.println(k); //k값은 0
		
		
		
		
		
		
		
		
		
	}
}
