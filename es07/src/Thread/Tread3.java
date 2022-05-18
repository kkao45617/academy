package Thread;

public class Tread3 {

	public static void main(String[] args) {
		Runnable r = new thread3();
		Thread t1= new Thread(r);
		
		thread1 t2 = new thread1();
		t1.start();
		t2.start();
	}

}

class thread1 extends Thread{
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(getName());
		}
	}
}

class thread3 implements Runnable{
	public void run () {
		for(int i=0; i<5;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}