package test;

//import chapter11.SimpleType;
import chapter11.TV;

public class Ex1 {
	public static void main(String[] args) {
//		SimpleType type = new SimpleType();
//		
//		type.num1 = 5;
//		
//		type.func1();
//		
//		type.
//		
		
		TV LG_TV = new TV();
		 LG_TV.setColor(null);
		
		// 객체지향 프로그래밍은 기능을 중심으로 프로그램을 개발하는 방법
		// 객체를 사용하는쪽에서는 객체가 제공하는 기능만을 사용해야한다.
		
		
		
		LG_TV.power();
		LG_TV.channelDown();
		LG_TV.channelUp();
		
		// 프로시져지향 프로그래밍 기법...
		// 데이터를 입력해서 출력
		// 수정사항이 생기면 전부 다 수정해야한다.
//		LG_TV.channel++;
//		LG_TV.channel--;
		
//		LG_TV.showChannel();
//		LG_TV.showChannel();
		
		// 전원을 켰을때 현재 채널을 알고 싶을때?
		// 1. 전원을 켜고
		LG_TV.power();
		
		// 2. 채널 번호를 알려준다.
		// getter
		System.out.println("현재 채널 번호는 "+ LG_TV.getChannel() + "번 입니다.");
		
	}
}
