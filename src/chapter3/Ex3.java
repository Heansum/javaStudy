package chapter3;

public class Ex3 {
	public static void main(String[] args) {
		
		// 철수의 국, 영, 수 합계
		int sum = 74 + 85 + 98;
		
		// 시험에 응시한 과목의 수
		int subject = 3;
		
		// 철수의 평균
		double avg = sum / (double) subject; // 하나만 해도 double 형으로 바꾼다
		
		System.out.println("철수의 총점 = " + sum);
		System.out.println("철수의 평균 = " + avg);
	}
}
