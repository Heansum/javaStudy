package chapter2;

public class Ex5 {
	public static void main(String[] args) {
//		String var1 = "ABCDEFG";
//		String var2 = "�ȳ��ϼ���";
//		
//		System.out.println(var1);
//		System.out.println(var2);
		
		char var1 = 'A';
		
		char num = '1';
		System.out.println(num-1);
		
		int Num = 1;
		System.out.println(Num-1);
		
		String var2 = "�ڸ���IT��ī����";
		
		String today = "2021-03-16";
		System.out.println(today);
		
		// ���� : byte, short, int, long
		// �Ǽ� : float, double
		// ���� : char
		// ���ڿ� : String -> �⺻ ������Ÿ�Ծƴ�
		// ���� : boolean
		
		// �⺻ ������Ÿ�԰� ����� ���� ������Ÿ��
		// �⺻ ������Ÿ�� - �ڹ� �����ڰ� ������� �������� ����
		// ����� ���� ������Ÿ�� - �츮���� �����ڰ� �ʿ信 ���ؼ� ���� ������ Ÿ��
		
		// �⺻ ������Ÿ�� - ���ڿ��� �� 8�� ������ Ÿ��
		// ����� ���� ������Ÿ�� - String
		
		// �⺻ ������Ÿ���� ���� �����ڸ��� ����ؼ� �����͸� ������ �� �ִ�.
		// ����� ���� ������Ÿ���� ���� �����ڿ� new�����ڸ� ����ؾ� �����͸� ������ �� �ִ�.
		
		String var4 = "�ڸ���IT��ī����";
		String var5 = new String("�ڸ���IT��ī����");
		System.out.println(var5);
		
	}
}