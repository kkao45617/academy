package ex04;
//제네릭 메소드 출력과 사용법

class box<T>{
	private T ob;
	public void set(T o) {ob=o;}
	public T get() {return ob;}
}
class abc{
	public static <T extends Number> void swapbox(box<T> box1, box<T>box2) {
		T temp = box1.get();
		box1.set(box2.get());
		box2.set(temp);
	}
}

public class ex04 {
	
	public static void main(String[] args) {
		box<Number> box1 = new box<>();
		box1.set(99.2);
		box<Number> box2 = new box<>();
		box2.set(15.1);
		
		System.out.println("전"+box1.get()+"&"+box2.get());
		
		abc.swapbox(box1,box2);
		System.out.println("후"+box1.get()+"&"+box2.get());
		
	}

}

