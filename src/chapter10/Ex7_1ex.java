package chapter10;

public class Ex7_1ex {
	// 36 % 5�� ����� �Ǽ������� ��ȯ�ϴ� div �޼��� ����
	double div(){
		double result = 36 % 5;
		
		return result;
	}
	
	// 1 ~ 5������ ���� ���� ������ ��ȯ�ϴ� stackAdd �޼��� ����
	int stackAdd() {
		int add = 0;
		for(int i=1; i<=5 ; i++) {
			add += i;
		}
		int result = 1 + 2 + 3 + 4 + 5;
		
		return add;
	}
	
	public static void main(String[] args) {
		Ex7_1ex ex7 = new Ex7_1ex();
		
		System.out.println(ex7.div());
		System.out.println(ex7.stackAdd());
	}
}
