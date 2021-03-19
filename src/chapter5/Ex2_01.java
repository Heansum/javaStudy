package chapter5;

import java.util.Scanner;

public class Ex2_01 {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		String a = "+";
		// next 메서드 -> 사용자가 입력한 값을 문자열로 가져옴
		String b = scanf.next();
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		// a==b x
		// a(equals)
		if(a == b) {
			System.out.println("a와 b가 같습니다.");
		} else {
			System.out.println("a와 b가 다릅니다.");
		}
	}
}
