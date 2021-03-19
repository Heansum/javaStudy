package chapter5;

import java.util.Scanner;

public class Ex1_08ex {
	static final int WEEK = 7;
	
	public static void main(String[] args) {
		// 나머지
		// 월	화	수	목	금	토	일
		// 1 	2 	3	4	5	6	0
		Scanner scanf = new Scanner(System.in);
		
		System.out.print("2021년 3월의 날짜 : ");
		
		// 사용자가 입력한 값을 정수로 받아온다.
		int dayOfMonth = scanf.nextInt();
		int dayOfWeek = dayOfMonth % 7;
		
		System.out.print("2021년 3월 "+ dayOfMonth + "일은 ");
		
		if(dayOfWeek == 0) {
			System.out.print("일요일");
		} else if (dayOfWeek == 1) {
			System.out.print("월요일");
		} else if (dayOfWeek == 2) {
			System.out.print("화요일");
		} else if (dayOfWeek == 3) {
			System.out.print("수요일");
		} else if (dayOfWeek == 4) {
			System.out.print("목요일");
		} else if (dayOfWeek == 5) {
			System.out.print("금요일");
		} else if (dayOfWeek == 6) {
			System.out.print("토요일");
		}
		
		System.out.print("입니다.");
	}
}
