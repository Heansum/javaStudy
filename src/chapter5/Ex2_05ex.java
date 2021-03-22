package chapter5;

import java.util.Scanner;

public class Ex2_05ex {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		int num = scanf.nextInt();
		
		int i = num % 2;
		
		switch(i) {
			case 0:
				System.out.println("Â¦¼ö");
				break;
			default:
				System.out.println("È¦¼ö");
		}
		
	
	
	}
}
