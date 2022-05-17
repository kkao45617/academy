package ex08;
//제네릭 와일드카드
class box<T>{
	protected T ob;
	public T getob() {
		return ob;
	}
	public void setob(T ob) {this.ob=ob;}
	@Override
	public String toString() {
		return ob.toString();
	}
}
class unboxer{
	public static <T> T openbox(box<T>box) {
		return box.getob();
	}
	
	public static void peekbox(box<?> box) {//와일드카드 기반 메소드 정의
		System.out.println(box);
	}
}
public class ex08 {

	public static void main(String[] args) {
		box<String> box = new box<>();
		box.setob("apple");
		unboxer.peekbox(box);
	}

}
