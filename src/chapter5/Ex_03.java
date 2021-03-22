package chapter5;

public class Ex_03 {
	public static void main(String[] args) {
		System.out.println("구구단 2단...");
		
		int j = 2;
		while(j <= 5) {
			int i = 1;
			
			while(i <= 9) {
				System.out.println(j +" * " + i + " = " + (j * i));
				
				i += 1;
			} // end while i
			
			j = j + 1;
		} // end while j
		
		
		int i = 1;
		
		while(i <= 9) {
			System.out.println("2 * " + i + " = " + (2 * i));
			
			i += 1;
		}
		
		
		int n = 1;
		
		System.out.println("구구단 출력!");
		while(n <= 9) {
			i = 1;
			
			while(i <= 9) {
				
				System.out.println( n +" * " + i + " = " + (n * i));
				i += 1;
			}
			System.out.println("============== \n");
			n += 1;
		}
		
	}
}
