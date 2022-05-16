package ex61;

import java.util.*;

class tv{
	String color;
	boolean power;
	int channel;
	
	void power() {
		power=!power;
	}
	void channelup() {++channel;
	
	}
	void channeldown() {
		--channel;
	}
}

public class ex61 {

	public static void main(String[] args) {
		tv t1=new tv();
		tv t2= new tv();
		
		System.out.println("t1의 채널은 "+t1.channel);
		System.out.println("t2의 채널은 "+t2.channel);
		t2=t1;
		t1.channel=7;
		System.out.println("t1의 채널을 7로 변경");
		
		System.out.println("t1의 채널 값"+t1.channel);
		System.out.println("t2의 채널 값"+t2.channel);
	}

}