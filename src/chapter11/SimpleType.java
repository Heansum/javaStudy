package chapter11;

public class SimpleType {
//	static int num1 = 10;
//	
//	static void hello() {
//		System.out.println("Hello World~!");
//	}
	
	
	// ���� ������
	// public: ��� Ŭ�������� ��� ����
	// default: ���� ��Ű�� �� Ŭ���������� ��� ����
	// protected: ���� ��Ű�� �Ǵ� �ڽ� Ŭ������ ��� ����
	// private: ���� �ڽŸ� ��� ����
	
	// ���� �����ڰ� �����ϴ� ����
	// ��ü�� �ִ� �����͸� ��ȭ��Ű�� �ʱ� ����
	// �����͸� ���Ƿ� �������� �ʱ����� ��ȣ�ϱ� ���� ��ġ�̴�.
	// ���ܼ� �ڵ带 �����ϰ� �Ѵ�.
	// ������ �ִ� ������׸� �����ִ� �� -> ĸ��ȭ�Ѵٰ� ǥ���Ѵ�.
	
	public int num1;
	int num2; // ���� �����ڰ� ������ default ���� �����ڰ� ���� �Ȱ�!
	private int num3;
	
	public void func1() {
		System.out.println("func1");
	}
	void func2() {
		System.out.println("func2");
	}
	private void func3() {
		System.out.println("func3");
	}
	
	
	
}
