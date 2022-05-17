package ex011;
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

	public static void peekbox(box<? super Integer> box) {//와일드카드 상한제한 super는 아래에서 위로 extends 위에서 아래로
		System.out.println(box);
	}
}
public class ex011 {

	public static void main(String[] args) {
		box<Integer> box = new box<>();
		box.setob(123);
		System.out.println(box.getob());
		//unboxer.peekbox(box);
		
		box<Number> box2 = new box<>();
		box2.setob(12.3);
		System.out.println(box2.getob());
		
		box<String> box3 = new box<>();
		box3.setob("sadfe");
		System.out.println(box3.getob());
		
		box<Object> box4 = new box<>();
		box4.setob(12312354);
		System.out.println(box4.getob());
	}

}
