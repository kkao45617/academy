package ex02;

class box<T>{
	private T ob;
	public void set(T o) {ob=o;}
	public T get() {return ob;}
}

class boxfactory{
	//제네릭 메소드
	//제네릭 메소드 표시 : <T>, box<T>:반환형 T o : 매게변수
	public static <T> box<T> makebox(T o){
		box<T> box = new box<T>();
		box.set(o);
		return box;
	}
}

public class ex02 {

	public static void main(String[] args) {
		box<String> sbox = boxfactory.makebox("sweet");
		System.out.println(sbox.get());
		box<Double> dbox = boxfactory.makebox(8.89);
		System.out.println(dbox.get());
	}

}
