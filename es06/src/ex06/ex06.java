package ex06;

class box<T>{
	protected T ob;
	public T getob() {
		return ob;
	}
	public void setob(T ob) {this.ob=ob;}
}
 
class emptyboxfactory{
	public static <T> box<T> makebox(){
		box<T> box = new box<T>();
		return box;
	}
}

public class ex06 {

	public static void main(String[] args) {
		box<Integer> ibox = emptyboxfactory.<Integer>makebox();
		
		ibox.setob(25);
		System.out.println(ibox.getob());
	}

}
