package chapter4;

public class Ex14 {
	public static void main(String[] args) {
		int var1;
		
		// obj1 안에는 int var1, double var2
		// char var3 String var4 를 저장할 수 있는 타입이 있다
		
		// 1. Ex11타입의 인스턴스를 생성
		// 2. obj1 객체에 저장(대입 연산)
		Ex11 obj1 = new Ex11();
		obj1.var1 = 10;
		obj1.var2 = 3.14;
		obj1.var3 = 'a';
		obj1.var4 = "Hello World~!";
				
		// 1. Ex12타입의 인스턴스를 생성
		// 2. obj2 객체에 저장
		Ex12 obj2 = new Ex12();
		obj2.num1 = 50;
		obj2.num2 = 100;
		//obj2 객체에 100, 50을 저장하세요.
		
		// 클래스라고 하는 나만의 데이터 타입 선언 			declare the type of data
		// 클래스를 사용해서 인스턴스를 생성				create instance by using class
		// 인스턴스 안에 데이터를 저장					store the data into the instance
		// 저장된 데이터를 출력							print the stored data
		
		
		// 1. Ex13타입의 인스턴스를 생성
		// 2. obj3 객체에 저장
		
		Ex13 obj3 = new Ex13();
		
		// obj3 객체에는 32, 180.6, 'A', "나이키", "삼성"을 저장하세요.
		
		obj3.num1 = 32;
		obj3.num2 = 180.6;
		obj3.var1 = 'A';
		obj3.var2 = "나이키";
		obj3.var3 = "삼성";
		
		System.out.println(obj3.num1);
		System.out.println(obj3.num2);
		System.out.println(obj3.var1);
		System.out.println(obj3.var2);
		System.out.println(obj3.var3);
		
		// 예제1. Ex13 클래스의 인스턴스를 만들고 ex13 객체에 저장하세요.
		Ex13 ex13 = new Ex13();
		
		// 예제2. chulsu 객체를 만들고 Student 클래스의 인스턴스를 저장하세요.
		Student chulsu = new Student();
		chulsu.name = "이철수";
		chulsu.age = 16;
		
		String name = "이철수";
		int age = 16;
		
		System.out.println(chulsu.name);
		System.out.println(chulsu.age);
		
		// 예제3. Student 클래스의 인스턴스를 만들고 student 객체에 저장하세요/
		Student student = new Student();
		
		System.out.println(student.name);
		System.out.println(student.age);
		
	}
}
