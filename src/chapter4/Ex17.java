package chapter4;

public class Ex17 {
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.kor = 56;			// °´Ã¼ÁöÇâÀû
		student1.eng = 41;
		student1.mat = 88;
		student1.sum = student1.kor + student1.eng + student1.mat;
		student1.avg = student1.sum / (double) Student.AMOUNT_OF_SUBJECT;
		
		int sum = student1.kor + student1.eng + student1.mat;		// ÀıÂ÷ÁöÇâÀû
		double avg = sum / 3.0;
		
		System.out.println("Ã¶¼öÀÇ ÃÑÁ¡ = " + sum);
		System.out.println("Ã¶¼öÀÇ Æò±Õ = " + avg);
		
	}
}
