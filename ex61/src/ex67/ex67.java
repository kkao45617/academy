package ex67;
class data{int x;}

public class ex67 {

	public static void main(String[] args) {
		data d = new data();
		d.x=10;
		System.out.println("main : x="+d.x);
		
		change(d.x);
		System.out.println("º¯È¯ÈÄ ");
		System.out.println("main :x="+d.x);
		
	}
	static void change(int x) {
		x=1000;
		System.out.println("change : x="+x);
	}

}