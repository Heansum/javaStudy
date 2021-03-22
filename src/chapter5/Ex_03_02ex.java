package chapter5;

import java.util.Scanner;

public class Ex_03_02ex {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		char repeat;
		
		
		int n = 1;
		int number = 1;
		
		while(true) {
			System.out.println("음악을 재생합니다.");
			
			n = 1;
			
			while(n <= 6) {
	
				System.out.println(n + "번 트랙 재생");
				System.out.println("다시 처음부터 트랙을 재생하시겠습니까?");
				repeat = scanf.next().charAt(0);
					if(repeat == 'y') {
						// 다시 처음부터 재생
						n = 1;
						continue;
					}
					
				n += 1;
			}
			
			System.out.println("다시 처음부터 트랙 전체를 재생하시겠습니까?");
			repeat = scanf.next().charAt(0);
			
			if(repeat != 'y') {
					break;
			}
		
			
		
		}
		
		
			
//			while(true) {
//				System.out.println("음악을 재생합니다.");
//				
//				System.out.println("1번 트랙 재생");
//				System.out.println("다시 처음부터 재생하시겠습니까?");
//				repeat = scanf.next().charAt(0);
//				if(repeat == 'y') {
//					// 다시 처음부터 재생
//					continue;
//				}
//				
//			while(true) {
//				System.out.println("2번 트랙 재생");
//				System.out.println("다시 처음부터 재생하시겠습니까?");
//				repeat = scanf.next().charAt(0);
//				if(repeat == 'y') {
//					// 다시 처음부터 재생
//					continue;
//			}
//			
//			while(true) {
//				System.out.println("2번 트랙 재생");
//				System.out.println("다시 처음부터 재생하시겠습니까?");
//				repeat = scanf.next().charAt(0);
//				if(repeat == 'y') {
//					// 다시 처음부터 재생
//					continue;
//			}
//			
	
		

			
			
			
			
	}
}
