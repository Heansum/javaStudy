package chapter4;

public class Ex1_8ex {
	public static void main(String[] args) {
		double[] avgArr = new double[4];
		avgArr[0] = 67;
		avgArr[1] = 81.3;
		avgArr[2] = 54.67;
		avgArr[3] = 64.67;
		
		avgArr[3] = avgArr[2];
		avgArr[2] = avgArr[1];
		avgArr[1] = avgArr[0];
		avgArr[0] = 78.99;
		
		System.out.println(avgArr[0]);
		System.out.println(avgArr[1]);
		System.out.println(avgArr[2]);
		System.out.println(avgArr[3]);
		
	}
}
