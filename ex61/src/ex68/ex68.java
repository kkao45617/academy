package ex68;

public class ex68 {

	public static void main(String[] args) {
		membercall m = new membercall();
		m.staticmethod1();
		m.instancemethod1();
	}

}
class membercall{
	int iv=10;
	static int cv=20;
	int iv2=cv;
	//static int cv2= iv;
	static int cv2=new membercall().iv;
	
	static void staticmethod1() {
		System.out.println(cv);
	//	System.out.println(iv);
		membercall c = new membercall();
		System.out.println(c.iv);
	}
	void instancemethod1() {
		System.out.println(cv);
		System.out.println(iv);
	}
	
	static void staticmethod2() {
		staticmethod1();
		//instancemethod1();
		membercall c = new membercall();
		c.instancemethod1();
	}
	void instancemethod2() {
		staticmethod1();
		instancemethod1();
	}
}