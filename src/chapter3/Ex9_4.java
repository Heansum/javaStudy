package chapter3;

import java.util.Scanner;

public class Ex9_4 {
	public static void main(String[] args) {
		
		/*
		 * ���� ��� ���α׷��� �����ϼ���.
		 * ���� ������ 0 ~ 100�� �����Դϴ�.
		 * ���� ������ �Է¹޾� ������ �������� ��ȯ���ּ���.
		 */
		
		// Scanner ��� �ٷ��� : �Է��� ���� �������� ����� ���� ����
		// ��� �ٷ��̸� ����Ϸ��� ��üȭ�� ���Ѿ���
		Scanner scanf = new Scanner(System.in);
		
		// ��ü�� �����ϴ� ��� -> �޼���
		// nextInt �޼��� : �Է��� ���� ������ �������� ���
		System.out.print("Put your korean score! : ");
		int kor = scanf.nextInt();
		System.out.println("Your korean score is "+ kor);
		
		// true, true ��� : 0 ~ 100�� ������ ���� ������ �Է��ߴ�
		// false, true �Ǵ� true, false : 0�� �̸� �Ǵ� 100���� �ʰ��ϴ� ���������� �Է��ߴ�.
		// 0 <= kor <= 100
		boolean right = (kor >= 0) && (kor <= 100);
		
		System.out.println(right);


	}
}
