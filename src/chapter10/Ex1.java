package chapter10;

// Ex1 Ŭ������ �޼��带 �����
// ���� �޼��带 ������ Ŭ����
// �޼��带 ����� -> �޼��带 �����Ѵ� / �����Ѵ�

// 1. �Ű������� ���� ��ȯ���� ���� �޼���
// 2. �Ű������� �ְ� ��ȯ���� ���� �޼���
// 3. �Ű������� ���� ��ȯ���� �ִ� �޼���

public class Ex1 {
	void simple1() {
		System.out.println("Hello World~!");
	}
	
	public static void main(String[] args) {
		Ex1 ex1 = new Ex1();
		
		// simple1 �޼��� ȣ��
		ex1.simple1();
		
		Ex2 ex2 = new Ex2();
		ex2.programStartMessage();
		ex2.plus();
		
		Ex3 ex3 = new Ex3();
		ex3.foundationDay();
		
		
	}
}
