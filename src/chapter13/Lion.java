package chapter13;

public class Lion extends Animal {
	public Lion() {
		super("����");
	}

	@Override
	public void run() {
		System.out.println(getMyName() + "��(��) �׹߷� �޸��ϴ�.");
	}

	@Override
	public void findFood() {
		System.out.println("��ɰ��� �i�ư� ��ҽ��ϴ�.");
	}

	@Override
	public void eatFood() {
		System.out.println("��ɰ��� �ͱ��ͱ� �Խ��ϴ�.");
	}
}