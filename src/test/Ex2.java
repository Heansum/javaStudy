package test;

import chapter12.Parent2;

public class Ex2 {
	public static void main(String[] args) {
		// ���� ��Ű���� �ִ� Ŭ���� �Ǵ�
		// ���� ��Ű���� �ִ� �ڽ� Ŭ������
		// �ش� ����� ������ �� �ֵ��� ���ִ� ���� ������
		// protected

		// public - �Ϲ������� �޼����� ���� ������ public���� ����
		//			public static final Ÿ�� ���� �̸�
		// default
		// private - �Ϲ������� ������ ���� ������ private���� ����
		// protected 
		chapter12.Parent2 parent = new chapter12.Parent2();

		System.out.println(parent.num);
	}
}
