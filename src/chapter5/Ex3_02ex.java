package chapter5;

public class Ex3_02ex {
	public static void main(String[] args) {
		// i�� 1����
		int i = 1;
		
		// 10������ ����
		while(i <= 10) {
			if(i % 2 == 0) {
				System.out.println(i); 
				
				// �ϳ��� �����ϸ鼭
				i += 1;
			}
			else i += 1;
		}
		
		i = 2;
		while(i <= 10 ) {
			
			System.out.println(i);
			i += 2;
			
		}
		
		
	}
}
