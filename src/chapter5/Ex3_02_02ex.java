package chapter5;

public class Ex3_02_02ex {
	public static void main(String[] args) {
		
		int i = 1;
		
		while(i <= 10) {
			if (i % 2 == 1) {
				System.out.println(i);
				i+=1;
			}
			else
				i+=1;
		}
		
		
		i = 1;
		
		while(i <= 10) {
			System.out.println(i);
			i += 2;
		}
	}
}
