package chapter10;

public class Ex6 {
	public static void main(String[] args) {
		Ex6 ex6 = new Ex6();
		
		SimpleType1 type = new SimpleType1();
		type.num1 = 10;
		
		System.out.println("before: " + type.num1);
		ex6.change(type);
		System.out.println("after : " + type.num1);
		System.out.println();
		
		int[] arr = {1,2,3};
		
		System.out.println("before: " + arr[0]);
		ex6.change(arr[0]);
		System.out.println("after: "+ arr[0]);
		
		
		
		
	}
	
		void change(int num1) {
			num1 = num1 * 10;
			
			System.out.println("change(int) : " + num1);
		}
	
	
		void change(SimpleType1 type) {
			type.num1 = type.num1 * 10;
			
			System.out.println("change(SimpleType1) : " + type.num1);
		}
		
		void change(int[] arr) {
			arr[0] = arr[0] * 10;
			
			System.out.println("change(int[]) : " + arr[0]);
		}
		
		
		
}
