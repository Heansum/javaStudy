package chapter5;

import java.util.Scanner;

public class Ex2_04 {
	public static void main(String[] args) {
		// 1�⵿�� ���� å�� ��
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("����� 1�⿡ �� ���� �о����ϱ�? ");
		int book = scanf.nextInt();
		
		int i = book / 10;
		
		System.out.println(book / 10);
		
//		System.out.println(0 / 10);
//		System.out.println(1 / 10);
//		System.out.println(2 / 10);
//		System.out.println(3 / 10);
//		System.out.println("===== =====");
//		
//		System.out.println(10 / 10);
//		System.out.println(11 / 10);
//		System.out.println(12 / 10);
//		System.out.println(19 / 10);
//		System.out.println("===== =====");
//		
//		System.out.println(21 / 10);
//		System.out.println(23 / 10);
//		System.out.println(24 / 10);
//		System.out.println(29 / 10);
//		System.out.println("===== =====");
//		
//		System.out.println(31 / 10);
//		System.out.println(35 / 10);
//		System.out.println(36 / 10);
//		System.out.println(39 / 10);
//		System.out.println("===== =====");
		
		if(book >= 0)
			switch(i) {
				case 0:
					// 1�⵿�� �� �ǵ� ���� �ʾ��� ���
					System.out.println("���� �� ����ϼ���!");
					break;
				case 1:
					// 1�⵿�� �� ���� �о��� ���
					System.out.println("å �д� ���� ���� ���̽ó׿�!");
					break;
				case 2: 
					// 1�⵿�� �� ���� �о��� ���
					System.out.println("å�� ����ϴ� ���̽ó׿�!");
					break;
				default:
					System.out.println("����� �ٵ����Դϴ�!!");
					break;
				
					
		} // end =switch
		
		else {
			System.out.println("�ٽ� �Է� ���ּ���!");
		}
	
	
	
	
	
	
	}
}
