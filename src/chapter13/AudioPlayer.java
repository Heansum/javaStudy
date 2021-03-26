package chapter13;

// 추상 클래스는 다른 클래스의 부모 클래스가 될 수 있다.
// 부모 클래스가 추상 클래스라면
// 자식 클래스는 부모 클래스에 정의되어있는
// 추상 메서드를 반드시 구현해야한다.
public abstract class AudioPlayer extends Player {

	@Override
	public void play(int pos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}
	// 부모 클래스에 정의되어있는 메서드를 자식 클래스에서 재정의하는 것 : 오버라이딩

	// 부모 클래스가 자식 클래스에게 할 일을 만들어 주는것
	// 하나의 메서드가 자식 클래스에 따라 서로 다른 동작을 하도록 강요 할때

}
