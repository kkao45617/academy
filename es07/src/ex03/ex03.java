package ex03;

class box<T>{
	private T ob;
	public void set(T o) {ob=o;}
	public T get() {return ob;}
}

class boxfactory{
	//제네릭 메소드
	//제네릭 메소드 표시 : <T>, box<T>:반환형 T o : 매게변수
	public static <T extends Number> box<T> makebox(T o){
		box<T> box = new box<T>();
		box.set(o);
		System.out.println("box data : "+ o.intValue());
		return box;
	}
}
class unboxer{
	public static <T extends Number> T openbox(box<T> box) {
		System.out.println("unboxer data :"+box.get().intValue());
		return box.get();
	}
}


public class ex03 {

	public static void main(String[] args) {
		box<Integer> sbox = boxfactory.makebox(2);
		System.out.println(sbox.get());
		box<Double> dbox = boxfactory.makebox(8.89);
		System.out.println(dbox.get());
		
		box<Integer> ibox=boxfactory.makebox(4896);
		int num=unboxer.openbox(ibox);
		System.out.println("result : "+num);
	}

}
