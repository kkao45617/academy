package ex09;
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
class toy{
	@Override
	public String toString() {
		return "i am toy";
	}
}
class robot extends toy{}  //box에 전달 대상은 toy , robot 가능
class boxhandler{//box에는 전달 가능 인스턴스는 toy 또는 toy상송한 아이들 
	public static void outbox(box<? extends toy> box) {
		toy t = box.getob();
		System.out.println(t);
		box.getob(); //
	}
	public static void inbox(box<toy>box,toy t) {
		box.setob(t);
	}
}
public class ex09 {

	public static void main(String[] args) {
		box<toy> box = new box<>();
		boxhandler.inbox(box, new toy());
		boxhandler.outbox(box);
		
	}

}
