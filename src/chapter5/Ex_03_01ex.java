package chapter5;

import java.util.Scanner;

public class Ex_03_01ex {
	public static void main(String[] args) {
		// while ���� �ַ� ���� �ݺ��� (���� ��Ȯ���� ����) �� ����
		
		Scanner scanf = new Scanner(System.in);
		// ������ �� ��� �ٽ� ������� ����
		char repeat = 'y';
		
		while(repeat == 'y') {
			System.out.println("������ ����մϴ�.");
			System.out.println("1�� Ʈ�� ���");
			System.out.println("2�� Ʈ�� ���");
			System.out.println("3�� Ʈ�� ���");
			System.out.println("4�� Ʈ�� ���");
			System.out.println("5�� Ʈ�� ���");
			System.out.println("6�� Ʈ�� ���");
			System.out.println("7�� Ʈ�� ���");
			System.out.println("8�� Ʈ�� ���");
			System.out.println("9�� Ʈ�� ���");
			System.out.println("10�� Ʈ�� ���");
			
			System.out.println("�ٽ� ó������ ����Ͻðڽ��ϱ�?");
			repeat = scanf.next().charAt(0);
			
		}
		
			System.out.println("������ ����մϴ�.");
			int i = 1;
			while(i <= 9) {
				System.out.println(i + "�� Ʈ�� ���");
				i += 1;
			}
			
			System.out.println("�ٽ� ó������ ����Ͻðڽ��ϱ�?");
			repeat = scanf.next().charAt(0);
		}
		
		
		
		
	}
}
