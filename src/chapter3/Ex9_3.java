package chapter3;

import java.util.Scanner;

public class Ex9_3 {
	public static void main(String[] args) {
		/*
		 * �� ������ : ����(true, false)�� �����ϱ� ���� ������
		 * true -> ��, 1
		 * false -> ����, 0
		 * 
		 * && : �� �� ��� true �� �� ����� true
		 * || : �� �� �� �ϳ��� true �� ����� true
		 * !  : true �� false ��, false �� true �� ���� �ݴ�� ������ִ� ������
		 */
		
		// ����
		System.out.println(true && true);		//true		as 1 * 1
		System.out.println(true && false);		//false		   1 * 0
		System.out.println(false && true);		//false		   0 * 1
		System.out.println(false && false);		//false		   0 * 0
		
		// ����
		System.out.println(true || true);		//true		as 1 + 1
		System.out.println(true || false);		//true	   	   1 + 0
		System.out.println(false || true);		//true		   0 + 1
		System.out.println(false || false);		//false		   0 + 0
		
		// 
		System.out.println(!true);
		System.out.println(!false);
		
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
		scanf.nextInt();
	}
}
