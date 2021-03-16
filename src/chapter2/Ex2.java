package chapter2;

public class Ex2 {
	public static void main(String[] args) {
		double num1 = 3.14;
		System.out.println(num1);
		
		char num2 = 'Z';
		System.out.println(num2);
		
		boolean num3 = false;
		System.out.println(num3);
		
		int num4 = 100;
		System.out.println(num4);
	
		// 변수명은 영문자, 숫자 특수문자($,_)만 사용할 수 있다.
		// 변수명은 한글도 되기는 하지만 권장하지는 않음
		int word;
		int word1;
		int word$;
		int word_;
		
		int 변수명1;
		int 변수명2;
		
		// 변수명의 시작은 영문자, 특수문자만 가능하다.
		int _word;
		int $word;
		
		// 변수명은 영문 대소문자를 구분한다.
		int apple = 17;
		int Apple = 27;
		
		System.out.println(apple);
		System.out.println(Apple);
		
		// 변수명은 키워드를 사용할 수 없다.
		// 키워드 - 영단어이기는 하지만 자바가 미리 선점한 영단어
		int _double = 17;
//		int short = 27;
		
		// 변수는 중복해서 선언할 수 없다.
		int apple1 = 17;
		apple1 = 27;
		
//		int 4Week; -> x
//		
//		int number1;
//		
//		String myAddress;
//		
//		double HEIGHT;
//		
//		double height;
//		
//		int HEIGHT; -> x
//		
//		char __grade__;
		
		
		// 카멜표기법(낙타표기법)
		int myAge;
		
		char myGrade;
		
//		double point_x; -> 자바에서는 일반적이지 않음
		
		// byte -> 주소 1칸(정수저장) 2,7승~-2,7승
		// short -> 주소 2칸 2의 15승
		// int -> 주소 4칸 2의 31승
		
	}
}



