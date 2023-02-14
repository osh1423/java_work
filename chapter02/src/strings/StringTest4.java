package strings;

public class StringTest4 {
	public static void main(String[] args) {
	
 // concat 지정된 문자열을 이 문자열의 끝에 연결합니다.
 String str1 = "hello~";
 String str2 = "world";
 String result = str1.concat(str2);
 System.out.println(result);
 // 출력값 hello~world
 
 // replace 바꾸고 싶은 문자열로 변경합니다.
 String str3 = "oh happy Xmas";
 String result1 = str3.replace("Xmas", "christmas");
 System.out.println(result1);
 // 출력값 oh happy christmas
 
 // length 문자열 길이를 반환합니다.
 String str4 = "hello world";
 System.out.println(str4.length());
// 출력값 11
 
 
	}
}
