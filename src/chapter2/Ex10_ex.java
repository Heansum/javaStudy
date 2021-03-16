package chapter2;

public class Ex10_ex {
	public static void main(String[] args) {
		// 실수 -> 정수로 형 변환
		// 업캐스팅 / 다운캐스팅 -> 다운캐스팅
		// 값의 변경 있음 / 없음 -> 있음
		double a = 1.1414;
		int b = (int) a;
		
		// 정수 -> 실수로 형 변환
		// 업캐스팅
		// 없음
		int c = 1;
		double d = (double) c;
		
		// 문자 -> 정수로 형 변환
		// 업캐스팅
		// 없음
		char e = 'A';
		int f = (int) e;
		
		// 정수 -> 문자로 형 변환
		// 다운캐스팅
		// 있음
		int g = 100;
		char h = (char) g;
	}
}
