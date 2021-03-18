package chapter4;

public class Ex2_2ex {
	public static void main(String[] args) {
		int[][] scores = {
				{84, 93, 52, 42},	//kor
				{62, 71, 79, 100},	//mat
				{55, 80, 33, 52}	//eng
		};
		
		System.out.println(scores[0][0]);
		System.out.println(scores[0][1]);
		
		int[][] student = {
				
			//	 0   1   2
				{84, 62, 55},	//Tom student1
				{93, 71, 80},	//Lilly
				{52, 79, 33},	//John
				{42, 100, 52}	//Jesica
		};
		
		System.out.println(student[0][0]);
		System.out.println(student[0][1]);
		System.out.println(student[0][2]);
		
		int kor1 = student[0][0];
		
		// 행번호만 사용했을 때 적절한 타입의 변수에 저장하세요.
		int[] student1 = student[0];
		System.out.println(student1[0]);
		System.out.println(student1[1]);
		System.out.println(student1[2]);
		
		// 행번호 설정 후 나중에 열 크기 설정가능.
		int[][] studentInfo = new int[3][];
		studentInfo[0] = new int[3];
		studentInfo[1] = new int[5];
		studentInfo[2] = new int[1];
		
	
		System.out.println(studentInfo[0][2]);
		
	}
}
