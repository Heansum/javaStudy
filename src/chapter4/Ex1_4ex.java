package chapter4;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1_4ex {
	public static void main(String[] args) {
		System.out.print("�� ���� ���� �� �� �Է��ϼ���. : ");
		Scanner scanf = new Scanner(System.in);
		int length = scanf.nextInt();
		System.out.println("���� ���� �� : " + length);
		
		
		int[] monthes = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		
		String[] date = {"3�� 2��", "3�� 3��", "3�� 4��", "3�� 5��", "3�� 6��"};
		System.out.println(Arrays.toString(date));
		date[0] = "3�� 1��";
		
		}
	}

