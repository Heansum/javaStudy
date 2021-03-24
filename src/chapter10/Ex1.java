package chapter10;

// Ex1 클래스는 메서드를 만들고
// 만든 메서드를 실행할 클래스
// 메서드를 만든다 -> 메서드를 정의한다 / 선언한다

// 1. 매개변수가 없고 반환값이 없는 메서드
// 2. 매개변수가 있고 반환값이 없는 메서드
// 3. 매개변수가 없고 반환값이 있는 메서드

public class Ex1 {
	void simple1() {
		System.out.println("Hello World~!");
	}
	
	public static void main(String[] args) {
		Ex1 ex1 = new Ex1();
		
		// simple1 메서드 호출
		ex1.simple1();
		
		Ex2 ex2 = new Ex2();
		ex2.programStartMessage();
		ex2.plus();
		
		Ex3 ex3 = new Ex3();
		ex3.foundationDay();
		
		
	}
}
