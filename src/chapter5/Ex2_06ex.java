package chapter5;

import java.util.Scanner;

public class Ex2_06ex {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		
		int dayOfMonth = scanf.nextInt();
		int dayOfWeek = (dayOfMonth % 7);
		
		switch(dayOfWeek) {
			case 1: System.out.println("월요일"); break;		// 사실 case 의 순서는 상관이 없음
			case 2: System.out.println("화요일"); break;
			case 3: System.out.println("수요일"); break;
			case 4: System.out.println("목요일"); break;
			case 5: System.out.println("금요일"); break;
			case 6: System.out.println("토요일"); break;
			default: System.out.println("일요일"); break;
		}
		
		
		
		
	}

}
