package chapter5;

import java.util.Scanner;

public class Ex2_01 {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		String a = "+";
		// next �޼��� -> ����ڰ� �Է��� ���� ���ڿ��� ������
		String b = scanf.next();
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		// a==b x
		// a(equals)
		if(a == b) {
			System.out.println("a�� b�� �����ϴ�.");
		} else {
			System.out.println("a�� b�� �ٸ��ϴ�.");
		}
	}
}
