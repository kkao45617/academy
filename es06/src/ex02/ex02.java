package ex02;

class box<T>{
	private T ob;
	public void set(T o) {
		ob = o;
		
	}
	public T get() {
		return ob;
	}
}
public class ex02 {

	public static void main(String[] args) {
		box<String> sbox = new box<>();
		sbox.set("apple");
		
		box<box<String>> wbox= new box<>();
		wbox.set(sbox);
		
		box<box<box<String>>> zbox = new box<>();
		
		zbox.set(wbox);
		
		System.out.println(zbox.get().get().get());
	}

}
