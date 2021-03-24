package chapter5;

import java.util.Scanner;

public class Ex4_03 {
	public static void main(String[] args) {
		// 아래와 같이 줄 수를 입력 받아 별(*)을 출력하세요.
		
		/*
		 * 줄 수 : (입력) 3		줄 수 : 5		줄 수 : 7
		 *	
		 * *					*				*
		 * **					**				**
		 * ***					***				***
		 * 						****			****
		 * 						*****			*****
		 *										******
		 *										*******
		 */									
		 
		Scanner scanf = new Scanner(System.in);
		
		int row = scanf.nextInt();
		
		
		
		// 줄 수를 관리하는 for문
		for(int i=1; i<=row; i++) {
			// n번째 줄에서 출력해야할 별의 개수를 관리하는 for문
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		} // end for
		
		
		
	}
}
