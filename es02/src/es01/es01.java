package es01;

public class es01 {

	public static void main(String[] args) {
		Object obj= new BBB(new F());
		Object obj2 = new AAA(new BBB());
	}

}
class b{
	public b() {
		
	}
	public b(Object a, int b, int c) {
		
	}
}
class F{
	int a;
	public F() {
		
	}
}
class AAA{
	public AAA(F a) {
		
	}
	public AAA(BBB a) {
		
	}
}

class BBB{
	public BBB() {
		
	}
	public BBB(Object a) {
		
	}
	public BBB(int a) {
		
	}
}

