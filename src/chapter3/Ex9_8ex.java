package chapter3;

import java.util.Scanner;

public class Ex9_8ex {
	public static void main(String[] args) {
		
		
		Scanner scanf = new Scanner(System.in);
		System.out.print("국어점수를 입력하세요 : ");
		int kor = scanf.nextInt();
		
		boolean check = (kor >= 0 && kor <= 100);
		
		String str = check ? "올바른 점수입니다 " : "점수가 잘못되었습니다 ";
		System.out.println(str);
		
		System.out.println("===== =====");
		
		check = (kor >= 50);
		str = check ? "국어점수는 50점 이상입니다 Pass" : "국어점수는 50점 미만입니다 Fail";
		System.out.println(str);
		
		
	}
}
