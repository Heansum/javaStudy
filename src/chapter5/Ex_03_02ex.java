package chapter5;

import java.util.Scanner;

public class Ex_03_02ex {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		char repeat;
		
		
		int n = 1;
		int number = 1;
		
		while(true) {
			System.out.println("������ ����մϴ�.");
			
			n = 1;
			
			while(n <= 6) {
	
				System.out.println(n + "�� Ʈ�� ���");
				System.out.println("�ٽ� ó������ Ʈ���� ����Ͻðڽ��ϱ�?");
				repeat = scanf.next().charAt(0);
					if(repeat == 'y') {
						// �ٽ� ó������ ���
						n = 1;
						continue;
					}
					
				n += 1;
			}
			
			System.out.println("�ٽ� ó������ Ʈ�� ��ü�� ����Ͻðڽ��ϱ�?");
			repeat = scanf.next().charAt(0);
			
			if(repeat != 'y') {
					break;
			}
		
			
		
		}
		
		
			
//			while(true) {
//				System.out.println("������ ����մϴ�.");
//				
//				System.out.println("1�� Ʈ�� ���");
//				System.out.println("�ٽ� ó������ ����Ͻðڽ��ϱ�?");
//				repeat = scanf.next().charAt(0);
//				if(repeat == 'y') {
//					// �ٽ� ó������ ���
//					continue;
//				}
//				
//			while(true) {
//				System.out.println("2�� Ʈ�� ���");
//				System.out.println("�ٽ� ó������ ����Ͻðڽ��ϱ�?");
//				repeat = scanf.next().charAt(0);
//				if(repeat == 'y') {
//					// �ٽ� ó������ ���
//					continue;
//			}
//			
//			while(true) {
//				System.out.println("2�� Ʈ�� ���");
//				System.out.println("�ٽ� ó������ ����Ͻðڽ��ϱ�?");
//				repeat = scanf.next().charAt(0);
//				if(repeat == 'y') {
//					// �ٽ� ó������ ���
//					continue;
//			}
//			
	
		

			
			
			
			
	}
}
