package chapter5;

public class Ex4_01 {

	public static void main(String[] args) {
		// �ʱ�� �ڸ��� ������ ������ for�������� ����� �� �ִ�.
		// ���� ���� : �ʱ�� -> ���ǽ� -> ������ -> ���ǽ� -> ������ -> ���ǽ� -> ...
		// for( �ʱ�� ; ���ǽ� ; ������ )
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);			// ���������� i�� �������
		}
		
		// �հ�
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		
		System.out.println(sum);
	}
}
