package chapter5;

import java.util.Scanner;

public class Ex1_08ex {
	static final int WEEK = 7;
	
	public static void main(String[] args) {
		// ������
		// ��	ȭ	��	��	��	��	��
		// 1 	2 	3	4	5	6	0
		Scanner scanf = new Scanner(System.in);
		
		System.out.print("2021�� 3���� ��¥ : ");
		
		// ����ڰ� �Է��� ���� ������ �޾ƿ´�.
		int dayOfMonth = scanf.nextInt();
		int dayOfWeek = dayOfMonth % 7;
		
		System.out.print("2021�� 3�� "+ dayOfMonth + "���� ");
		
		if(dayOfWeek == 0) {
			System.out.print("�Ͽ���");
		} else if (dayOfWeek == 1) {
			System.out.print("������");
		} else if (dayOfWeek == 2) {
			System.out.print("ȭ����");
		} else if (dayOfWeek == 3) {
			System.out.print("������");
		} else if (dayOfWeek == 4) {
			System.out.print("�����");
		} else if (dayOfWeek == 5) {
			System.out.print("�ݿ���");
		} else if (dayOfWeek == 6) {
			System.out.print("�����");
		}
		
		System.out.print("�Դϴ�.");
	}
}
