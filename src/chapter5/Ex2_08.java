package chapter5;

import java.util.Scanner;

public class Ex2_08 {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("�ڸ��� IT ���Ǳ�");
		System.out.println("1. �ݶ�");
		System.out.println("2. ȯŸ");
		System.out.println("3. ���̴�");
		System.out.println("4. ����ƾ��");
		System.out.println("���Ǳ��� ��ư�� �������� : ");
		
		int button = scanf.nextInt();
		
		switch(button) {
			case 1: System.out.println("�ݶ�"); break;
			case 2: System.out.println("ȯŸ"); break;
			case 3: System.out.println("���̴�"); break;
			case 4: System.out.println("����ƾ��"); break;
			default: System.out.println("1 ~ 4���� ���� �� �ֽ��ϴ�."); 		// ���� ó�� �ڵ�!
		}
	}
}
