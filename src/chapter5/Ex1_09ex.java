package chapter5;

import java.util.Scanner;

public class Ex1_09ex {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		
		System.out.print("�� ���� �Է��ϼ��� : ");
		int Input1 = scanf.nextInt();
		int Input2 = scanf.nextInt();
		
		if ((Input1 >= 0 && Input1 <= 100) && (Input2 >= 0 && Input2 <= 100))
		{
			if (Input1 > Input2) {
				System.out.println(Input1);
			} else {
				System.out.println(Input2);
			}
		}
		else {
			System.out.println("0 ~ 100 ������ ���� �����մϴ�.");
		}
		
		scanf.close();
		
	}
}
