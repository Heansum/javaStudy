package chapter10;

public class Ex8_2ex {
	// �� add �޼���� �̸��� ������ �Ű������� �ٸ��Ƿ�
	// �����ε��� �޼����̴�.
	// overloading method
	
	// �� ������ ���� ����� ��ȯ�ϴ� �޼���
	int add(int num1, int num2) {
		return num1 + num2;
	}
	
	// �� �Ǽ��� ���� ����� ��ȯ�ϴ� �޼���
	double add(double fnum1, double fnum2) {
		return fnum1 + fnum2;
	}
	
	// �ϳ��� ������ �ϳ��� �Ǽ��� ���� ����� ��ȯ�ϴ� �޼���
	double add(int fnum1, double num2) {
		return fnum1 + num2;
	}
	
	int num1;
	
	static int num2;
	
	
	void instanceMemberMethod() {
		System.out.println("�ν��Ͻ� ��� �޼���");
	}
	
	static void classMemberMethod() {
		System.out.println("Ŭ���� ��� �޼���");
	}
	
	public static void main(String[] args) {
		Ex8_2ex ex8_2ex = new Ex8_2ex();
		ex8_2ex.instanceMemberMethod();
		
		Ex8_2ex.classMemberMethod();
		
		
	}

}
