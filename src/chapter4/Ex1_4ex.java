package chapter4;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1_4ex {
	public static void main(String[] args) {
		System.out.print("그 달의 일자 수 를 입력하세요. : ");
		Scanner scanf = new Scanner(System.in);
		int length = scanf.nextInt();
		System.out.println("달의 일자 수 : " + length);
		
		
		int[] monthes = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		
		String[] date = {"3월 2일", "3월 3일", "3월 4일", "3월 5일", "3월 6일"};
		System.out.println(Arrays.toString(date));
		date[0] = "3월 1일";
		
		}
	}

