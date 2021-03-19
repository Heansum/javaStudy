package chapter5;

public class Ex1_03 {
	public static void main(String[] args) {
		System.out.println("코드 시작");
		
		if(true) {
			System.out.println("이 if문은");
			System.out.println("참이므로");
			System.out.println("코드가 실행됩니다");
		}
		else {
			System.out.println("이 if문은");
			System.out.println("참이므로");
			System.out.println("코드가 실행되지 않습니다");
		}
		
		int num = 0;
		if(num == 0) {
			System.out.println("변수 num에 들어있는 값은 0입니다.");
		} else {
			System.out.println("변수 num에 들어있는 값은 0이 아닙니다.");
		}
		
		System.out.println("코드 종료");
	}
}
