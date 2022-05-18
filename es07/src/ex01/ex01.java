package ex01;

class box<T>{
	private T ob;
	public void set(T o) {ob=o;}
	public T get() {return ob;}
}

class unboxer{
	//제네릭 메소드
	//제네릭 메소드 표시 : <T>, box<T>:반환형 T o : 매게변수
	public static <T> T makebox(box<T> box){
		return box.get();
	}
}

public class ex01 {

	public static void main(String[] args) {
		box<String> sbox = new box<>();
		sbox.set("generic method");
		
		
		String str = unboxer.makebox(sbox);
		System.out.println(str);
	}

}
