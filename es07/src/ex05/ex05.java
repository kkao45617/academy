package ex05;

public class ex05 {

	public static void main(String[] args) {
		Thread ct = Thread.currentThread();
		String name = ct.getName();
		
		System.out.println(name);
	}

}
