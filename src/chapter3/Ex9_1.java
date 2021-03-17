package chapter3;

public class Ex9_1 {
	public static void main(String[] args) {
		String monja1 = "apple";		// 실제로는 메모리 주소를 가지고 있음
		String monja2 = "banana";		// ""
		
		System.out.println(monja1 == monja2);	// 메모리 주소가 같습니까?
		
		System.out.println(monja1 != monja2);	// 메모리 주소가 다릅니까?
	}
}
