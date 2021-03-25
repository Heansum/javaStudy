package chapter11;

public class SimpleType {
//	static int num1 = 10;
//	
//	static void hello() {
//		System.out.println("Hello World~!");
//	}
	
	
	// 접근 제어자
	// public: 모든 클래스에서 사용 가능
	// default: 같은 패키지 내 클래스에서만 사용 가능
	// protected: 같은 패키지 또는 자식 클래스만 사용 가능
	// private: 오직 자신만 사용 가능
	
	// 접근 제어자가 존재하는 이유
	// 객체에 있는 데이터를 변화시키지 않기 위해
	// 데이터를 임의로 변경하지 않기위한 보호하기 위한 장치이다.
	// 숨겨서 코드를 간결하게 한다.
	// 권한이 있는 사람한테만 보여주는 걸 -> 캡슐화한다고 표현한다.
	
	public int num1;
	int num2; // 접근 제어자가 없으면 default 접근 제어자가 생략 된것!
	private int num3;
	
	public void func1() {
		System.out.println("func1");
	}
	void func2() {
		System.out.println("func2");
	}
	private void func3() {
		System.out.println("func3");
	}
	
	
	
}
