package chapter12;

// 상속의 주의사항
// - 클래스 내 코드가 중복된다고 해서 무조건 상속을 사용하면 안된다.
// - Person, Student 클래스처럼 공통된 특징이 있는 상태에서
// - 코드가 중복될 경우에만 상속을 사용할 수 있다.
// - 기존의 특징에서 확장될 경우!
// - 그림으로도 알아놓자

// - 자식 클래스는 또 다른 클래스의 부모 클래스가 될 수 있다.

public class Student extends Person {
	public void study() {
		System.out.println("공부하기");
	}
	
	public void run() {
		System.out.println("달리기");
	}
	
	
}
