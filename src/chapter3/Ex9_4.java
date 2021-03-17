package chapter3;

import java.util.Scanner;

public class Ex9_4 {
	public static void main(String[] args) {
		
		/*
		 * 성적 계산 프로그램을 개발하세요.
		 * 국어 성적은 0 ~ 100점 사이입니다.
		 * 국어 성적을 입력받아 적절한 학점으로 변환해주세요.
		 */
		
		// Scanner 기능 꾸러미 : 입력을 위한 여러가지 기능을 갖고 있음
		// 기능 꾸러미를 사용하려면 구체화를 시켜야함
		Scanner scanf = new Scanner(System.in);
		
		// 객체가 제공하는 기능 -> 메서드
		// nextInt 메서드 : 입력한 값을 정수로 가져오는 기능
		System.out.print("Put your korean score! : ");
		int kor = scanf.nextInt();
		System.out.println("Your korean score is "+ kor);
		
		// true, true 경우 : 0 ~ 100점 사이의 국어 점수를 입력했다
		// false, true 또는 true, false : 0점 미만 또는 100점을 초과하는 국어점수를 입력했다.
		// 0 <= kor <= 100
		boolean right = (kor >= 0) && (kor <= 100);
		
		System.out.println(right);


	}
}
