package chapter3;

import java.util.Scanner;

public class Ex9_8ex {
	public static void main(String[] args) {
		
		
		Scanner scanf = new Scanner(System.in);
		System.out.print("���������� �Է��ϼ��� : ");
		int kor = scanf.nextInt();
		
		boolean check = (kor >= 0 && kor <= 100);
		
		String str = check ? "�ùٸ� �����Դϴ� " : "������ �߸��Ǿ����ϴ� ";
		System.out.println(str);
		
		System.out.println("===== =====");
		
		check = (kor >= 50);
		str = check ? "���������� 50�� �̻��Դϴ� Pass" : "���������� 50�� �̸��Դϴ� Fail";
		System.out.println(str);
		
		
	}
}
