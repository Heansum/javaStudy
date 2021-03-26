package chapter12;

public class Ex5 {
	public static void main(String[] args) {
//		Car car = null;
		FireEngine fe1 = new FireEngine();
		FireEngine fe2 = null;
		
		// 업캐스팅 / 형변환 연산자 생략 가능
//		car = (Car) fe1;	// 기존에 알고있는걸 그대로 할당이 불가능하다 -> 그래서 객체의 형태를 타입변환하여 할당한다, 
							//전체를 다 알고있지만 삭제되지는 않은채로 전달된다
		
		// 다운캐스팅 / 형변환 연산자 생략 불가능
//		fe2 = (FireEngine) car;	// --> 그래서 그대로 남는다
		
//		car.water();
		fe1.water();
//		fe2.water();
		
		FireEngine fe = new FireEngine();
		System.out.println(fe instanceof FireEngine);
		System.out.println(fe instanceof Car);
		System.out.println(fe instanceof Object);
		
		Car car = new Car();
		System.out.println(car instanceof FireEngine);
		System.out.println(car instanceof Car);
		System.out.println(car instanceof Object);
		
		
		
		
	}
}
