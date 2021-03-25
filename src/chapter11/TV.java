package chapter11;

public class TV {
	// �ܺη� �����ϸ� �ȵǴ� �����͸� ���ߴ� ���� ĸ��ȭ, ��������
	private String color;
	private boolean power;
	private int channel;	// �� Ŭ���� �������� �޼��忡�� �����ϱ� ���ؼ� private ���� ������
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
		
		System.out.println("�Ű� ���� �ϳ� ������ ȣ��");
	}
	
	public TV(int channel, int volume) {
		this.channel = channel;
		this.volume = volume;
		
		System.out.println("�Ű� ���� �ΰ� ������ ȣ��");
	}
	
	public TV(String color) {
		this.color = color;
		System.out.println("�Ű����� �ϳ��� ������");
	}
	
	public TV(boolean power, int channel) {
		this.power = power;
		this.channel = channel;
		System.out.println("�Ű����� �ΰ��� ������");
	}
	
	
	
	
	// ��ü������ �����͵��� ���� ���� ��ü�� �����ؾ��ϰ�
	// ��ü�� �����ϴ� ����� �����ؾ��ϹǷ�
	// ������Ʈ ���� �Ⱓ�� ������� ������ ����
	// ������Ʈ�� �Ը� Ŀ���� ���� ��������
	// ������Ʈ�� ��ü���������� ����� ���踦 �صθ�
	// �������� �ӵ��� ������ ��������.
	
	// ���ν��������� �����͸� �����ϸ� �ǹǷ�
	// ������Ʈ ���� �Ⱓ�� ��������� ª�� ������ ����
	// ������Ʈ�� �Ը� Ŀ���� �����Ͱ� �Ź���ó�� ������ ���ǹǷ�
	// �������� �ӵ��� ������ ��������.
	
	
	// �ٱ� class ���� object�� �ִ� instance�� ���� �����ϱ� ���� set method �� ����Ѵ� 
	// setter -> private ���� �������� ��� ������ ���ϴ� ���� �����ؾ��� �� �ʿ��� �޼���
	public void setColor(String color) {
		// TV�� �÷��� red, blue�� �����ϴ�.
		if(color.equals("red") || color.equals("blue")) {
			this.color = color;
		} else {
			System.out.println("�÷��� ����� ��縸 �˴ϴ�.");
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
	
	
	
	
	
	
	
	// ���� �޼��� - �ѹ��� �ϳ��� ��ɸ� �����ϴ� �޼���
	// 1. ������ �Ѱ�
	// 2. ���� ä�� ��ȣ�� �˷��ش�.
	public void power() {
		power = !power;
		
		if(power) {
			System.out.println("������ �׽��ϴ�.");
			
			showChannel();
		} else {
			System.out.println("������ �����ϴ�.");
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
	
	// channelUp / Down �޼��带 ���� �޼���
	// Method in method
	private void showChannel() {
		System.out.println("���� ä�ι�ȣ�� " + channel + "�� �Դϴ�.");
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
//			System.out.println("������ �մϴ�");
//		} else {
//			System.out.println("������ ���ϴ�");
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
//		System.out.println("���� ä���� �Դϴ�.");
//	}
//	
	
}
