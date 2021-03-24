package chapter10;

public class Ex8 {
	int add(int num1, int num2) {
		int result = num1 + num2;
		
		return result;
	}
	
	
	public static void main(String[] args) {
		Ex8 ex8 = new Ex8();
		
		int result = ex8.add(1, 1);
		System.out.println(result);
	}

}
