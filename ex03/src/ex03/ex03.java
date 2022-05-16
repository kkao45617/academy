package ex03;
class tv{
	String color;
	boolean power;
	int channel;
	
	void power() {
		power=!power;
	}
	void channelup() {
		++channel;
	}
	void channeldown() {
		--channel;
	}
	void colorch() {
		System.out.printf("블루존"+",");
	}
}

public class ex03 {

	public static void main(String[] args) {
		tv t1= new tv();
		tv t2= new tv();
		System.out.println(t1.channel);
		System.out.println(t2.channel);
		t2=t1;
		t1.channel=6;
		System.out.println(t1.channel+"t1채널");
		System.out.println(t2.channel+"t2채널");
		
	}

}
