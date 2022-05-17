package ex07;
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
	
	public static <T> void peekbox(box<T> box) {
		System.out.println(box);
	}
}
public class ex07 {

	public static void main(String[] args) {
		box<String> box = new box<>();
		box.setob("apple");
		unboxer.peekbox(box);
	}

}
