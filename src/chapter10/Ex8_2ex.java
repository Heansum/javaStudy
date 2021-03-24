package chapter10;

public class Ex8_2ex {
	// 세 add 메서드는 이름은 같지만 매개변수가 다르므로
	// 오버로딩된 메서드이다.
	// overloading method
	
	// 두 정수를 더한 결과를 반환하는 메서드
	int add(int num1, int num2) {
		return num1 + num2;
	}
	
	// 두 실수를 더한 결과를 반환하는 메서드
	double add(double fnum1, double fnum2) {
		return fnum1 + fnum2;
	}
	
	// 하나의 정수와 하나의 실수를 더한 결과를 변환하는 메서드
	double add(int fnum1, double num2) {
		return fnum1 + num2;
	}
	
	int num1;
	
	static int num2;
	
	
	void instanceMemberMethod() {
		System.out.println("인스턴스 멤버 메서드");
	}
	
	static void classMemberMethod() {
		System.out.println("클래스 멤버 메서드");
	}
	
	public static void main(String[] args) {
		Ex8_2ex ex8_2ex = new Ex8_2ex();
		ex8_2ex.instanceMemberMethod();
		
		Ex8_2ex.classMemberMethod();
		
		
	}

}
