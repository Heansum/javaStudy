package chapter5;

import java.util.Scanner;

public class Ex4_04 {
	public static void main(String[] args) {
		String number = "0123456789";
		System.out.println(number.length());
		for(int i=0; i<number.length(); i++) {
			System.out.println(number.charAt(i));
		}
		
		String a = "111111111112323232323";
		System.out.println(a.length());
		// for문을 사용해서 a 객체에 들어있는 문자열에
		// 처음부터 끝까지 접근해서 출력하세요.
		for(int i=0; i<a.length(); i++) {
			char monja = a.charAt(i);
			
			if(monja == 'a') {
				System.out.println(monja);
			}
			
			System.out.println(a.charAt(i));
		}
		
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("문자열 입력: ");
		String input = scanf.nextLine();
		
		for(int i=0; i<input.length(); i++) {
			// input 문자열 내 공백문자를 제거하고 출력하는 코드
			char monja = input.charAt(i);
			
			if(monja != ' ') {
				System.out.print(monja);
			}
		}
		
		
		
		
		
		
		
	}
}
