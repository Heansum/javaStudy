package chapter5;

import java.util.Scanner;

public class Ex4_03 {
	public static void main(String[] args) {
		// �Ʒ��� ���� �� ���� �Է� �޾� ��(*)�� ����ϼ���.
		
		/*
		 * �� �� : (�Է�) 3		�� �� : 5		�� �� : 7
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
		
		
		
		// �� ���� �����ϴ� for��
		for(int i=1; i<=row; i++) {
			// n��° �ٿ��� ����ؾ��� ���� ������ �����ϴ� for��
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		} // end for
		
		
		
	}
}
