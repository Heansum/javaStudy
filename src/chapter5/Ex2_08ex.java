package chapter5;

import java.util.Scanner;

public class Ex2_08ex {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		int button = scanf.nextInt();
		
		switch(button) {
			case 1: 
			case 2: 
			case 3: 
				System.out.println("�ݶ�");
				break;
			case 4: 
				System.out.println("ȯŸ"); 
				break;
			case 5: 
			case 6: 
				System.out.println("���̴�");
				break;
			case 7: System.out.println("����ƾ��"); 
				break;
			default: System.out.println("1 ~ 7 ���� ���� �� �ֽ��ϴ�.");
		}
	}
}
