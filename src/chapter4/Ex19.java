package chapter4;

import java.util.Arrays;

public class Ex19 {
	public static void main(String[] args) {
		int num1 = 10;
		
		int[] arr1 = new int[2];
		arr1[0] = num1;
		
		System.out.println(num1);
		System.out.println(Arrays.toString(arr1));
		
		num1++;
		
		System.out.println(num1);
		System.out.println(Arrays.toString(arr1));
		
		System.out.println("===== =====");
		
		Student student = new Student();
		student.name = "김철수";
		
		Student[] studentList = new Student[2];
		studentList[0] = student;
		
		System.out.println(student.name);
		System.out.println(studentList[0].name);
		
		student.name = "고영희";
		
		System.out.println(student.name);
		System.out.println(studentList[0].name);
		
		// 객체가 메모리 주소를 가지고 있기 때문에 수정 시 그 안에 값도 바꿀 수 있다
		// 연결되어있다
		// 반면 위에 int 는 연결되어있지 않다
	}
}
