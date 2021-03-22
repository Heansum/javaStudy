package chapter5;

public class Ex4_02 {
	public static void main(String[] args) {
		// гу╟Х
		int sum = 0;
		for(int i=1; i<= 10; i++) {
			int su = i % 2;
			
			if(su == 1) sum += i;
		}
		
		System.out.println(sum);
		
		int sum1 = 0;
		for(int i=1; i<=10; i++) {
			int su = i % 2;
			
			if (su == 0) sum1 += i;
		}
		
		System.out.println(sum1);
		
		sum = 0;
		for(int i=2 ; i<=10; i+=2) {
			sum += i;
		}
		
		System.out.println(sum);
		
	}
}
