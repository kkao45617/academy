package ex01;
//E : Element
//k : key
//n : number
//t : type
//v : value
class dbox<L,R>{
	private L left;
	private R right;
	
	public void set(L l,R r) {
		left = l;
		right =r;
	}
	@Override
	public String toString() {
		return left + "&"+right;
	}
}

public class ex01 {

	public static void main(String[] args) {
		dbox<String,Integer> box = new dbox();
		box.set("apple", 20); //new Integer(20)이 자동 생성된 형태
		System.out.println(box);
		box.set("apple2", new Integer(50)); //50 넣어도 실행됨
		System.out.println(box);
	}

}
