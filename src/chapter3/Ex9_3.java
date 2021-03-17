package chapter3;

import java.util.Scanner;

public class Ex9_3 {
	public static void main(String[] args) {
		/*
		 * 논리 연산자 : 논리값(true, false)를 연산하기 위한 연산자
		 * true -> 참, 1
		 * false -> 거짓, 0
		 * 
		 * && : 두 값 모두 true 일 때 결과가 true
		 * || : 두 값 중 하나만 true 면 결과가 true
		 * !  : true 를 false 로, false 를 true 로 값을 반대로 만들어주는 연산자
		 */
		
		// 논리곱
		System.out.println(true && true);		//true		as 1 * 1
		System.out.println(true && false);		//false		   1 * 0
		System.out.println(false && true);		//false		   0 * 1
		System.out.println(false && false);		//false		   0 * 0
		
		// 논리합
		System.out.println(true || true);		//true		as 1 + 1
		System.out.println(true || false);		//true	   	   1 + 0
		System.out.println(false || true);		//true		   0 + 1
		System.out.println(false || false);		//false		   0 + 0
		
		// 
		System.out.println(!true);
		System.out.println(!false);
		
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
		scanf.nextInt();
	}
}
