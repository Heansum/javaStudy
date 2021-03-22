package chapter5;

import java.util.Scanner;

public class Ex2_04 {
	public static void main(String[] args) {
		// 1년동안 읽은 책의 수
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("당신은 1년에 몇 권을 읽었습니까? ");
		int book = scanf.nextInt();
		
		int i = book / 10;
		
		System.out.println(book / 10);
		
//		System.out.println(0 / 10);
//		System.out.println(1 / 10);
//		System.out.println(2 / 10);
//		System.out.println(3 / 10);
//		System.out.println("===== =====");
//		
//		System.out.println(10 / 10);
//		System.out.println(11 / 10);
//		System.out.println(12 / 10);
//		System.out.println(19 / 10);
//		System.out.println("===== =====");
//		
//		System.out.println(21 / 10);
//		System.out.println(23 / 10);
//		System.out.println(24 / 10);
//		System.out.println(29 / 10);
//		System.out.println("===== =====");
//		
//		System.out.println(31 / 10);
//		System.out.println(35 / 10);
//		System.out.println(36 / 10);
//		System.out.println(39 / 10);
//		System.out.println("===== =====");
		
		if(book >= 0)
			switch(i) {
				case 0:
					// 1년동안 한 권도 읽지 않았을 경우
					System.out.println("조금 더 노력하세요!");
					break;
				case 1:
					// 1년동안 한 권을 읽었을 경우
					System.out.println("책 읽는 것을 즐기는 분이시네요!");
					break;
				case 2: 
					// 1년동안 두 권을 읽었을 경우
					System.out.println("책을 사랑하는 분이시네요!");
					break;
				default:
					System.out.println("당신은 다독왕입니다!!");
					break;
				
					
		} // end =switch
		
		else {
			System.out.println("다시 입력 해주세요!");
		}
	
	
	
	
	
	
	}
}
