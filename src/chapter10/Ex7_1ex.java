package chapter10;

public class Ex7_1ex {
	// 36 % 5의 결과를 실수값으로 변환하는 div 메서드 선언
	double div(){
		double result = 36 % 5;
		
		return result;
	}
	
	// 1 ~ 5까지의 누적 합을 정수로 반환하는 stackAdd 메서드 선언
	int stackAdd() {
		int add = 0;
		for(int i=1; i<=5 ; i++) {
			add += i;
		}
		int result = 1 + 2 + 3 + 4 + 5;
		
		return add;
	}
	
	public static void main(String[] args) {
		Ex7_1ex ex7 = new Ex7_1ex();
		
		System.out.println(ex7.div());
		System.out.println(ex7.stackAdd());
	}
}
