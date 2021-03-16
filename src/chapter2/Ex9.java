package chapter2;

public class Ex9 {
	public static void main(String[] args) {
		char monja = 'A';
		int num = 20;
		
		// 문자를 정수로 변환(업캐스팅) -> 업캐스팅의 경우 형변환 연산자 생략 가능
		int num2 = monja;
		
		// 정수를 실수로 변환(업캐스팅)
		float fNum2 = num2;
		
		// 다운캐스팅 일 경우 형변환 연산자 필수 -> 개발자의 인지 확인을 위해서
		char var = (char) num;
		
		
	}
}
