package chapter4;

public class Ex14 {
	public static void main(String[] args) {
		int var1;
		
		// obj1 �ȿ��� int var1, double var2
		// char var3 String var4 �� ������ �� �ִ� Ÿ���� �ִ�
		
		// 1. Ex11Ÿ���� �ν��Ͻ��� ����
		// 2. obj1 ��ü�� ����(���� ����)
		Ex11 obj1 = new Ex11();
		obj1.var1 = 10;
		obj1.var2 = 3.14;
		obj1.var3 = 'a';
		obj1.var4 = "Hello World~!";
				
		// 1. Ex12Ÿ���� �ν��Ͻ��� ����
		// 2. obj2 ��ü�� ����
		Ex12 obj2 = new Ex12();
		obj2.num1 = 50;
		obj2.num2 = 100;
		//obj2 ��ü�� 100, 50�� �����ϼ���.
		
		// Ŭ������� �ϴ� ������ ������ Ÿ�� ���� 			declare the type of data
		// Ŭ������ ����ؼ� �ν��Ͻ��� ����				create instance by using class
		// �ν��Ͻ� �ȿ� �����͸� ����					store the data into the instance
		// ����� �����͸� ���							print the stored data
		
		
		// 1. Ex13Ÿ���� �ν��Ͻ��� ����
		// 2. obj3 ��ü�� ����
		
		Ex13 obj3 = new Ex13();
		
		// obj3 ��ü���� 32, 180.6, 'A', "����Ű", "�Ｚ"�� �����ϼ���.
		
		obj3.num1 = 32;
		obj3.num2 = 180.6;
		obj3.var1 = 'A';
		obj3.var2 = "����Ű";
		obj3.var3 = "�Ｚ";
		
		System.out.println(obj3.num1);
		System.out.println(obj3.num2);
		System.out.println(obj3.var1);
		System.out.println(obj3.var2);
		System.out.println(obj3.var3);
		
		// ����1. Ex13 Ŭ������ �ν��Ͻ��� ����� ex13 ��ü�� �����ϼ���.
		Ex13 ex13 = new Ex13();
		
		// ����2. chulsu ��ü�� ����� Student Ŭ������ �ν��Ͻ��� �����ϼ���.
		Student chulsu = new Student();
		chulsu.name = "��ö��";
		chulsu.age = 16;
		
		String name = "��ö��";
		int age = 16;
		
		System.out.println(chulsu.name);
		System.out.println(chulsu.age);
		
		// ����3. Student Ŭ������ �ν��Ͻ��� ����� student ��ü�� �����ϼ���/
		Student student = new Student();
		
		System.out.println(student.name);
		System.out.println(student.age);
		
	}
}
