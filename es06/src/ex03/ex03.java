package ex03;
//제한 주는법
class box<T extends Number>{ //T에 들어올 수 잇는 대상은 number 이거나 number을 상속하는 자식뿐
	private T ob;
	public void set(T o) {
		ob = o;
		
	}
	public T get() {
		return ob;
	}
}

class person{
	
}
public class ex03 {

	public static void main(String[] args) {
		person p = new person();
		//box<String> abox = new box<>();   number의 상속받는 과정에 String을 상속받지 않아서
		box<Integer> abox = new box<>();
		abox.set(3);
		System.out.println(p);
		
	}

}
