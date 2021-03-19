package chapter5;

public class Ex1_07ex {
	static final int nowYear = 2021;
	
	public static void main(String[] args) {
		
		int year = 1998;
		int age = Ex1_07ex.nowYear - year;
		
		if(age >= 1 && age <= 7) {
			System.out.println("미취학 유아동입니다");
		} else if (age >= 8 && age <= 13) {
			System.out.println("초등학생입니다");
		} else if (age >= 14 && age <= 16) {
			System.out.println("중학생입니다");
		} else if (age >= 17 && age <= 19) {
			System.out.println("고등학생입니다");
		} else if (age >= 20) {
			System.out.println("성인입니다");
		}
		
	}
}
