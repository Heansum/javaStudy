package chapter5;

import java.util.Scanner;

public class Ex2_06ex {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		
		int dayOfMonth = scanf.nextInt();
		int dayOfWeek = (dayOfMonth % 7);
		
		switch(dayOfWeek) {
			case 1: System.out.println("������"); break;		// ��� case �� ������ ����� ����
			case 2: System.out.println("ȭ����"); break;
			case 3: System.out.println("������"); break;
			case 4: System.out.println("�����"); break;
			case 5: System.out.println("�ݿ���"); break;
			case 6: System.out.println("�����"); break;
			default: System.out.println("�Ͽ���"); break;
		}
		
		
		
		
	}

}
