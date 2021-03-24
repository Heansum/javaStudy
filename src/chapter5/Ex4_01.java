package chapter5;

public class Ex4_01 {

	public static void main(String[] args) {
		// �ʱ�� �ڸ��� ������ ������ for�������� ����� �� �ִ�.
		// ���� ���� : �ʱ�� -> ���ǽ� -> ������ -> ���ǽ� -> ������ -> ���ǽ� -> ...
		// for( �ʱ�� ; ���ǽ� ; ������ )
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);			// ���������� i�� �������
		}
		
//		// 1 ~ 10���� ¦���� ��
//		int sum = 0;
//		for(int i=1; i<=10; i++) {
//			sum += i;
//		}
//		
//		System.out.println(sum);
	
		// factorial - ��������
		// 1! = 1
		// n! = n * (n-1)!
		// 3! = 3 * 2 * 1
		// 5! = 5 * 4 * 3 * 2 * 1
	
		// n!�� �ݺ����� ����ؼ� ���ϼ���.
		// n���� 1���� �ϳ��� �����ϸ鼭 ������ ������Ű�� �ݺ���
		
		int n = 10;
		int sum = 1;
		
		for (int i = n; i>=1; i--) {
			sum = sum * i;
			System.out.println(i);
		}	
			
		System.out.println("������ ��� = " + sum);
			
		// 1���� 10���� �����ϴ� �ϳ��� for������ Ȧ��, ¦���� ���� ���ϼ���.	
	
		int sum1 = 0;
		int sum2 = 0;
		for (int i=1; i<=10; i++) {
			if (i % 2 == 0) {
				sum1 += i;
			} else {
				sum2 += i;
			}
		} // end for i
		
		System.out.println("¦���� �� = " + sum1);
		System.out.println("Ȧ���� �� = " + sum2);
		
	
	}
}
