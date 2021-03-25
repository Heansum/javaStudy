package chapter11;

public class TV {
	// 외부로 공개하면 안되는 데이터를 감추는 것을 캡슐화, 정보은닉
	private String color;
	private boolean power;
	private int channel;	// 이 클래스 내에서만 메서드에서 수정하기 위해서 private 으로 설정함
	private int volume;
	private int hour;
	private int minute;
	private int second;
	
	public TV(){
		color = "black";
		power = false;
		channel = 1;
	}
	
	public TV(int channel) {
		this.channel = channel;
		
		System.out.println("매개 변수 하나 생성자 호출");
	}
	
	public TV(int channel, int volume) {
		this.channel = channel;
		this.volume = volume;
		
		System.out.println("매개 변수 두개 생성자 호출");
	}
	
	public TV(String color) {
		this.color = color;
		System.out.println("매개변수 하나인 생성자");
	}
	
	public TV(boolean power, int channel) {
		this.power = power;
		this.channel = channel;
		System.out.println("매개변수 두개인 생정자");
	}
	
	
	
	
	// 객체지향은 데이터들을 갖고 있을 객체를 생각해야하고
	// 객체가 제공하는 기능을 설계해야하므로
	// 프로젝트 개발 기간이 길어지는 단점이 있음
	// 프로젝트의 규모가 커지면 점점 복잡해짐
	// 프로젝트를 객체지향적으로 제대로 설계를 해두면
	// 유지보수 속도가 굉장히 빨라진다.
	
	// 프로시져지향은 데이터만 생각하면 되므로
	// 프로젝트 개발 기간이 상대적으로 짧은 장점이 있음
	// 프로젝트의 규모가 커지면 데이터가 거미줄처럼 얽혀서 사용되므로
	// 유지보수 속도가 굉장히 느려진다.
	
	
	// 바깥 class 에서 object에 있는 instance의 값을 설정하기 위해 set method 를 사용한다 
	// setter -> private 접근 제어자인 멤버 변수에 원하는 값을 설정해야할 때 필요한 메서드
	public void setColor(String color) {
		// TV의 컬러는 red, blue만 가능하다.
		if(color.equals("red") || color.equals("blue")) {
			this.color = color;
		} else {
			System.out.println("컬러는 레드와 블루만 됩니다.");
		}
	}
	
	
	
	public int getVolume() {
		return volume;
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	public String getColor() {
		return color;
	}
	
	public void setPower(boolean power) {
		this.power = power;
	}



	public void setChannel(int channel) {
		this.channel = channel;
	}



	public void setVolume(int volume) {
		this.volume = volume;
	}



	public void setHour(int hour) {
		this.hour = hour;
	}



	public void setMinute(int minute) {
		this.minute = minute;
	}



	public void setSecond(int second) {
		this.second = second;
	}



	public boolean getPower() {
		return power;
	}
	
	
	
	
	public int getChannel() {
		return channel;
	}
	
	
	
	
	
	
	
	// 좋은 메서드 - 한번에 하나의 기능만 제공하는 메서드
	// 1. 전원을 켜고
	// 2. 현재 채널 번호를 알려준다.
	public void power() {
		power = !power;
		
		if(power) {
			System.out.println("전원을 켰습니다.");
			
			showChannel();
		} else {
			System.out.println("전원을 껏습니다.");
		}
	}
	
	public void channelUp() {
		channel++;
		
		showChannel();
	}
	
	public void channelDown() {
		channel--;
		
		showChannel();
	}
	
	// channelUp / Down 메서드를 위한 메서드
	// Method in method
	private void showChannel() {
		System.out.println("현재 채널번호는 " + channel + "번 입니다.");
	}
	
//	
//	double size;
//	double length;
//	double height;
//	String color;
//	
//	int volume;
//	int channel;
//	boolean power;
//	
//	void power() {
//		power = !power;
//		
//		if(power) {
//			System.out.println("전원을 켭니다");
//		} else {
//			System.out.println("전원을 끕니다");
//		}
//	}
//	
//	void turnOff() {
//		
//	}
//	
//	void volumeUp() {
//		
//	}
//	
//	void volumeDown() {
//		
//	}
//	
//	void ChannelUp() {
//		channel++;
//		
//		showChannel();
//	}
//	
//	void showChannel() {
//		System.out.println("현재 채널은 입니다.");
//	}
//	
	
}
