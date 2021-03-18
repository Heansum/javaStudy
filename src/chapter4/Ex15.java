package chapter4;

public class Ex15 {
	public static void main(String[] args) {
		SimpleType1 type1 = new SimpleType1();
		type1.num1 = 10;
		SimpleType1.num2 = 11;
		
		SimpleType1 type2 = new SimpleType1();
		type2.num1 = 20;
		SimpleType1.num2 = 21;
		
		System.out.println(type1.num1);
		System.out.println(type2.num1);
		
		System.out.println(type1.num2);
		System.out.println(type2.num2);
		
		// 인스턴스 멤버 변수는 코드블럭이 끝나면 사라진다.
	}	// <<<<<
}
