package chapter2;

public class Ex5 {
	public static void main(String[] args) {
//		String var1 = "ABCDEFG";
//		String var2 = "안녕하세요";
//		
//		System.out.println(var1);
//		System.out.println(var2);
		
		char var1 = 'A';
		
		char num = '1';
		System.out.println(num-1);
		
		int Num = 1;
		System.out.println(Num-1);
		
		String var2 = "코리아IT아카데미";
		
		String today = "2021-03-16";
		System.out.println(today);
		
		// 정수 : byte, short, int, long
		// 실수 : float, double
		// 문자 : char
		// 문자열 : String -> 기본 데이터타입아님
		// 논리값 : boolean
		
		// 기본 데이터타입과 사용자 정의 데이터타입
		// 기본 데이터타입 - 자바 개발자가 만들어준 데이터의 형태
		// 사용자 정의 데이터타입 - 우리같은 개발자가 필요에 의해서 만든 데이터 타입
		
		// 기본 데이터타입 - 문자열을 뺀 8개 데이터 타입
		// 사용자 정의 데이터타입 - String
		
		// 기본 데이터타입은 대입 연산자만을 사용해서 데이터를 저장할 수 있다.
		// 사용자 정의 데이터타입은 대입 연산자와 new연산자를 사용해야 데이터를 저장할 수 있다.
		
		String var4 = "코리아IT아카데미";
		String var5 = new String("코리아IT아카데미");
		System.out.println(var5);
		
	}
}