package polymorphism;

public class LGtv implements TV{
	public void poweron() {
		System.out.println("LG 전원 들어옴");
	}
	public void pweroff() {
		System.out.println("LG 전원 꺼짐");
	}
	
	public void volumeup() {
		System.out.println("LG 소리 키우기");
	}
	public void volumedown() {
		System.out.println("LG 소리 줄이기");
	}
}
