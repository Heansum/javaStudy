package chapter13;

public class Child implements 인터페이스명{

	@Override
	public void memMethod1() {
		
	}

	@Override
	public void memMethod2() {
		
	}

	@Override
	public void memMethod3() {
		
	}
	
	// 한 클래스의 부모클래스는 오직 클래스만 와야한다
	// The type 인터페이스명 cannot be the superclass of Child; a superclass must be a class
	
	// 한 클래스의 부모는 클래스만 될수가 있다.
	// 클래스의 상속은 한번에 하나의 클래스만 상속할 수 있다.
	// 인터페이스의 상속은 한번에 여러 인터페이스를 상속할 수 있다.
	// 클래스는 단일 상속만 가능
	// 인터페이스는 다중 상속
	
}


