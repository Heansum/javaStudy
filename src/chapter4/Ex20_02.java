package chapter4;

public class Ex20_02 {
	public static void main(String[] args) {
		double pi = 3.141592;
		
		System.out.println((int)pi);
		
		// �Ҽ��� 3° �ڸ����� ���
		double pi_1 = pi * 1000;
		System.out.println(pi_1);
		
		int pi_2 = (int)(pi * 1000);
		System.out.println(pi_2);
		
		double pi_3 = (int)(pi * 1000) / 1000.0;
		System.out.println(pi_3);
		
		System.out.println(pi);
		
		// �Ҽ��� 3° ¥������ �ݿø� �� ���
		double pi_4 = pi * 100;
		System.out.println(pi_4);
		
		double pi_5 = (pi * 100) + 0.5;
		System.out.println(pi_5);
		
	}
}
