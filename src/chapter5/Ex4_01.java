package chapter5;

public class Ex4_01 {

	public static void main(String[] args) {
		// 초기식 자리에 선언한 변수는 for문에서만 사용할 수 있다.
		// 실행 순서 : 초기식 -> 조건식 -> 증감식 -> 조건식 -> 증감식 -> 조건식 -> ...
		// for( 초기식 ; 조건식 ; 증감식 )
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);			// 빠져나오면 i는 사라진다
		}
		
//		// 1 ~ 10까지 짝수의 합
//		int sum = 0;
//		for(int i=1; i<=10; i++) {
//			sum += i;
//		}
//		
//		System.out.println(sum);
	
		// factorial - 순차곱샘
		// 1! = 1
		// n! = n * (n-1)!
		// 3! = 3 * 2 * 1
		// 5! = 5 * 4 * 3 * 2 * 1
	
		// n!을 반복문을 사용해서 구하세요.
		// n부터 1까지 하나씩 감소하면서 곱셈을 누적시키는 반복문
		
		int n = 10;
		int sum = 1;
		
		for (int i = n; i>=1; i--) {
			sum = sum * i;
			System.out.println(i);
		}	
			
		System.out.println("순차곱 결과 = " + sum);
			
		// 1부터 10까지 증가하는 하나의 for문에서 홀수, 짝수의 합을 구하세요.	
	
		int sum1 = 0;
		int sum2 = 0;
		for (int i=1; i<=10; i++) {
			if (i % 2 == 0) {
				sum1 += i;
			} else {
				sum2 += i;
			}
		} // end for i
		
		System.out.println("짝수의 합 = " + sum1);
		System.out.println("홀수의 합 = " + sum2);
		
	
	}
}
