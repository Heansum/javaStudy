package chapter5;

public class Ex3_02ex {
	public static void main(String[] args) {
		// i가 1부터
		int i = 1;
		
		// 10이하일 동안
		while(i <= 10) {
			if(i % 2 == 0) {
				System.out.println(i); 
				
				// 하나씩 증가하면서
				i += 1;
			}
			else i += 1;
		}
		
		i = 2;
		while(i <= 10 ) {
			
			System.out.println(i);
			i += 2;
			
		}
		
		
	}
}
