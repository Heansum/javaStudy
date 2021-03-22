package chapter5;

public class Ex4_01 {

	public static void main(String[] args) {
		// 초기식 자리에 선언한 변수는 for문에서만 사용할 수 있다.
		// 실행 순서 : 초기식 -> 조건식 -> 증감식 -> 조건식 -> 증감식 -> 조건식 -> ...
		// for( 초기식 ; 조건식 ; 증감식 )
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);			// 빠져나오면 i는 사라진다
		}
		
		// 합계
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		
		System.out.println(sum);
	}
}
