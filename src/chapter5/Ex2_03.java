package chapter5;

public class Ex2_03 {
	public static void main(String[] args) {
		int num = 3;
		
		switch(num) {	// 여닫는 중괄호 때문에 break 문이 없으면 그 중괄호 안에 있는 걸 다 실행한다.
			case 1:
				System.out.println("1입니다.");
				break;
			case 2:
				System.out.println("2입니다.");
				break;
			case 3:
				System.out.println("3입니다.");
				
			case 4:
				System.out.println("4입니다.");
				break;
			
		} // end switch
		
	} // end main
} // end class
