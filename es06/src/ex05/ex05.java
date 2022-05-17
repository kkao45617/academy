package ex05;
class box<T>{
	protected T ob;
	public T getob() {
		return ob;
	}
	public void setob(T ob) {this.ob=ob;}
}
class steelbox<T> extends box<T>{
	public steelbox(T t) {ob=t;}
}
public class ex05 {

	public static void main(String[] args) {
		box<Integer> ibox = new steelbox(7959);
		box<String> sbox= new steelbox("simple");
		
		System.out.println(ibox.getob());
		System.out.println(sbox.getob());
	}

}
