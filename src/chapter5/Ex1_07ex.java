package chapter5;

public class Ex1_07ex {
	static final int nowYear = 2021;
	
	public static void main(String[] args) {
		
		int year = 1998;
		int age = Ex1_07ex.nowYear - year;
		
		if(age >= 1 && age <= 7) {
			System.out.println("������ ���Ƶ��Դϴ�");
		} else if (age >= 8 && age <= 13) {
			System.out.println("�ʵ��л��Դϴ�");
		} else if (age >= 14 && age <= 16) {
			System.out.println("���л��Դϴ�");
		} else if (age >= 17 && age <= 19) {
			System.out.println("����л��Դϴ�");
		} else if (age >= 20) {
			System.out.println("�����Դϴ�");
		}
		
	}
}
