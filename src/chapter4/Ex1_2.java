package chapter4;

import java.util.Scanner;

public class Ex1_2 {
	public static void main(String[]args) {
		
		// �迭�� ������ �������� ������ ���������� ����� ����
		// �ڹٴ� Ư���� ������ ���� �� ����
		// ������ Ÿ�ӿ� �迭�� ũ�⸦ �����Ѵ�. (CompileTime)
		// ���� �迭 ���� (Static)
		char[] arr1 = new char[2]; // -> ����� �迭�� ũ�⸦ �����ϴ� ���� ������ Ÿ�ӿ� �迭�� ũ�⸦ �����ϴ� ���̴�.
		
		System.out.println("�迭�� ���� : ");
		
		Scanner scanf = new Scanner(System.in);
		
		int length = scanf.nextInt();
		// ��Ÿ�ӿ� �迭�� ũ�⸦ �����Ѵ�. (Runtime)
		// ���� �迭 ���� (Dynamic)
		char[] arr1_1 = new char[length];
		
		
	}
}
