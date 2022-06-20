package polymorphism;

public class samsungTV implements TV{
	public samsungTV() {
		System.out.println("생성자 호출 완료");
	}
	public void poweron() {
		System.out.println("samsung 전원 들어옴");
	}
	public void pweroff() {
		System.out.println("samsung 전원 꺼짐");
	}
	
	public void volumeup() {
		System.out.println("samsung 소리 키우기");
	}
	public void volumedown() {
		System.out.println("samsung 소리 줄이기");
	}
}
