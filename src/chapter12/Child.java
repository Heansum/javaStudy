package chapter12;

public class Child extends Parent {
	// �θ� Ŭ�����κ��� ��� ���� ������ �����ϴ� x
	public int x;
	public int y;
	
	public Child() {
		this(0, 0);	//1
		
		System.out.println("�Ű������� ���� ������");//7
	}
	
	public Child(int x, int y) {	//2
		super(1);	//3
		// �θ� Ŭ������ �����ڰ� �Ű������� �ʿ��ϴٸ� 
		// ��ӹ��� �ڽ� Ŭ������ �����ڿ��� �Ű������� �־��ش�
		
		System.out.println("�Ű����� �ִ� ������");	//4
		
		this.x = x;//5
		this.x = y;//6
	}
	// ��� ���迡���� �ڽ� Ŭ������ �⺻ �����ڴ�
	// �Ű������� ���� �θ� Ŭ������ �⺻ �����ڸ� ȣ���Ѵ�.
//	public Child() {
//		super();
//	}
	
	
	// �ڽ� Ŭ������ �ν��Ͻ��� ������� ��
	// �θ� Ŭ������ ������� ���� �����ϹǷ�
	
//	// �ڽ� Ŭ������ �����ڸ� ����ٸ�
//	// �ڽ� Ŭ������ �������� �� ó���� �θ� Ŭ������ �����ڸ� ȣ���ؾ��Ѵ�. 
//	public Child(int x, int y) {
//		// �⺻ �����ڸ� ���� �߰��߰�
//		// �θ� Ŭ������ �⺻ �����ڸ� ȣ���ϴ� �ڵ带
//		// �ۼ����� �ʾҴ�.
//		// -> �����Ϸ��� �ڵ����� �߰�����
//		super();
//		
//		System.out.println("�ڽ� Ŭ������ ������");
//		this.x = x;
//		this.y = y;
//		
//	}
	
	
//		System.out.println("x = " + x);
//		System.out.println("this.x = " + this.x);
//		System.out.println("super.x = " + super.x);
//	}
	public void method() {
		
	public static void main(String[] args) {
		Child child = new Child();
	}
	
	
}
