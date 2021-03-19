package chapter4;

// 클래스는 실행되지 않고 묶어놓는다. (main 안에 있는 문장만 실행된다.) 
// 클래스를 선언하기 위한 클래스로 사용된다 (main 포함하지 않음)

public class Student {
	String name;
	int age;
	String addr;
	int kor;
	int eng;
	int mat;
	int sum;
	double avg;
	
	// 일반 변수는 카멜표기법으로 적는다
	
	// 파이널 변수는 대문자와 언더바를 쓴다 
	// 응시한 과목의 수
	// 일반적으로 static final 키워드가 붙은 기준이되는 값은
	// 변수의 이름을 대문자로 지어준다.
	static final int AMOUNT_OF_SUBJECT = 3;
}
