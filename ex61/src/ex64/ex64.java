package ex64;

public class ex64 {

	public static void main(String[] args) {
		tv[] tvarr= new tv[3];
		for(int i=0;i<tvarr.length;i++) {
			tvarr[i]= new tv();
			tvarr[i].channel =i+10;
		}
		for(int i=0; i<tvarr.length; i++) {
			tvarr[i].channelup();
			System.out.printf("tvarr[%d].channel=%d%n",i,tvarr[i].channel);
		}
	}

}
class tv{
	String color;
	boolean power;
	int channel;
	
	void power() {power=!power;}
	void channelup() {++channel;}
	void channeldown() {--channel;}
}
