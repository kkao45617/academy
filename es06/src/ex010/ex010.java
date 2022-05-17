package ex010;
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

	public static void peekbox(box<? extends Number> box) {//와일드카드 지원
		System.out.println(box);
	}
}
public class ex010 {

	public static void main(String[] args) {
		box<Integer> box = new box<>();
		box.setob(123);
		
		System.out.println(box.getob());
		//unboxer.peekbox(box);
	}

}
